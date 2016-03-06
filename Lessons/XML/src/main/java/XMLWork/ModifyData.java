package XMLWork;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;


public class ModifyData {
    public static void modifyData() throws IOException, SAXException, ParserConfigurationException, TransformerException {
        Document document = LoadWriteInFile.loadFile("xmlFile");
        Node root = document.getFirstChild();
        Node blog = document.getElementsByTagName("blog").item(0);
        NamedNodeMap namedNodeMap = blog.getAttributes();
        Node nodeAttr = namedNodeMap.getNamedItem("id");
        nodeAttr.setTextContent("3");

        Element site = document.createElement("site");
        site.appendChild(document.createTextNode("http://javism.blogspot.com/"));
        blog.appendChild(site);

        NodeList list = blog.getChildNodes();

        for(int i = 0; i < list.getLength(); i++)//должны по всему списку идти а меняем только первый
        {
            Node node = list.item(i);
            if("author".equals(node.getNodeName()))
                node.setTextContent("Pavel O");
            if("language".equals(node.getNodeName()))
                blog.removeChild(node);
        }


        LoadWriteInFile.writeInFile("xmlFile", document);







    }

}
