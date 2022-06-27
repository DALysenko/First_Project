import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import roads.model.OSM;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        OSM osm = null;
        File file = new File("NCH.osm");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Ошибка парсинга" + e.toString());
            return;
        }



        System.out.println(osm.toString());
    }
}
