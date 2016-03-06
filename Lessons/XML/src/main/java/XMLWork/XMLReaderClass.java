package XMLWork;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;


public class XMLReaderClass {
    public static void main(String[] args) throws SAXException, TransformerException, ParserConfigurationException, IOException {
       // ModifyData.modifyData();//модифицирует только первый элемент???
      //  CreateNewXml.createNewXML();
        CountXMLDocElem.countXmlElem("count");
    }
}

