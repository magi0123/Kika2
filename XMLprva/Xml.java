package XMLprva;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml {
	public void createXMLFile (String fileName) {
		
		try {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		
		Element root = document.createElement("Student");
		root.appendChild(document);
		
		Element ime = document.createElement("Ime");
		document.appendChild(ime);
		
		Element prezime = document.createElement("Prezime");
		document.appendChild(prezime);
		
		Element index = document.createElement("Index");
		document.appendChild(index);
		
		ime.appendChild(document.createTextNode("Magdalena"));
		prezime.appendChild(document.createTextNode("Apostolovska"));
		index.appendChild(document.createTextNode("840"));
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		
		StreamResult result = new StreamResult(new File(fileName));
		StreamResult result1 = new StreamResult(System.out);
		
		transformer.transform (source, result);
		System.out.println("Fajlot e kreiran, imeto e: "+ fileName);
		System.out.println(result1);
		System.out.println("Fajlot e zachuvan.");
		
		}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	}
		
	}


