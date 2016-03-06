package XMLWork;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Anna on 05.03.2016.
 */
public class FileParserDOM {
    public static void fileParserDOM() throws ParserConfigurationException, IOException, SAXException {

        Document document = LoadWriteInFile.loadFile("xmlFile");

        System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
        NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());//item(1)???
        System.out.println("--------------------");
        for(int tmp = 0; tmp < nodeList.getLength(); tmp++)
        {
            Node node = nodeList.item(tmp);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element)node;
                System.out.println("Blog #" + tmp + ":");
                System.out.println("Author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Language: " + element.getElementsByTagName("language").item(0).getChildNodes().item(0).getNodeValue());
            }
        }

    }
}
