package XMLWork;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class CountXMLDocElem {
    public static void countXmlElem(String docName) throws IOException, SAXException, ParserConfigurationException {
        Document document = LoadWriteInFile.loadFile(docName);
        NodeList tmp = document.getDocumentElement().getChildNodes();
        String nodeName = "";
        for(int i = 0; i < tmp.getLength(); i++)
        {
            if(tmp.item(i).getNodeType() == Node.ELEMENT_NODE)
                nodeName = tmp.item(i).getNodeName();
        }
        NodeList nodeList = document.getElementsByTagName(nodeName);

        System.out.print("Всего блогов: " + nodeList.getLength());

    }

}
