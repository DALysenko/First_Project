import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import roads.model.OSM;
import roads.model.Way;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OSM osm = new OSM();
        File file = new File("NCH.osm");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("Ошибка парсинга" + e.toString());
            return;
        }

        Node osmNode = doc.getFirstChild();
        NodeList osmChilds = osmNode.getChildNodes();

        String boundsNode = null;
        Node wayNode = null;

        for(int i = 0; i < osmChilds.getLength(); i++) {
            if(osmChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            /*System.out.println("AAA " + osmChilds.item(i).getNodeName());*/
            switch (osmChilds.item(i).getNodeName()) {
                case "bounds": {
                    boundsNode = osmChilds.item(i).getTextContent();
                    System.out.println("bounds" + boundsNode);
                }
                case "way": {
                    wayNode = osmChilds.item(i);
                }
            }
        }

        osm.setBounds(boundsNode);

        if(wayNode == null) {
            return;
        }

        List<Way> wayList = new ArrayList<>();
        NodeList wayChilds = wayNode.getChildNodes();
        for(int i = 0; i < wayChilds.getLength(); i++) {

            if (wayChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            if (!wayChilds.item(i).getNodeName().equals("nd")) {
                continue;
            }
            if(!wayChilds.item(i).getNodeName().equals("tag")) {
                continue;
            }


        }
    }
}
