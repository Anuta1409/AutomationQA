package SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class javism_sax_reader {
    public static void main(String[] args)
    {
        try
        {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler()
            {
                boolean bAuthor = false;
                boolean bLanguage = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                    System.out.println("Start element: " + qName);
                    if(qName.equalsIgnoreCase("AUTHOR")){
                        bAuthor = true;
                    }
                    if(qName.equalsIgnoreCase("LANGUAGE")){
                        bLanguage = true;
                    }
                }

                public void endElement(String uri, String localName, String qName) throws SAXException{
                    System.out.println("End element: " + qName);
                }

                public void characters(char ch[], int start, int length) throws SAXException{
                    if(bAuthor){
                        System.out.println("Author: " + new String(ch, start, length));
                        bAuthor = false;
                    }
                    if(bLanguage){
                        System.out.println("Language: " + new String(ch, start, length));
                        bLanguage = false;
                    }
                }
            };

            saxParser.parse("XMLFile", defaultHandler);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }
}

