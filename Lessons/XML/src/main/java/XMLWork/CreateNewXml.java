package XMLWork;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by Anna on 05.03.2016.
 */
public class CreateNewXml {
    public static void createNewXML() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();
        Element rootElement = document.createElement("blogs");
        document.appendChild(rootElement);

        Element blog = document.createElement("blog");
        rootElement.appendChild(blog);

        Attr attr = document.createAttribute("id");
        attr.setValue("1");
        blog.setAttributeNode(attr);

        Element author = document.createElement("author");
        author.appendChild(document.createTextNode("Pavel"));
        blog.appendChild(author);


        Element language = document.createElement("language");
        language.appendChild(document.createTextNode("Java"));
        blog.appendChild(language);

        LoadWriteInFile.writeInFile("New.xml",document);

        StreamResult result = new StreamResult(System.out);

    }



}
