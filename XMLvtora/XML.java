package XMLvtora;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public void createFile(String fileName, Vraboten vraboten) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();

			Element root = document.createElement("Vraboten");
			root.appendChild(document);

			Element ime = document.createElement("Ime");
			document.appendChild(ime);

			Element prezime = document.createElement("Prezime");
			document.appendChild(prezime);

			Element plata = document.createElement("Plata");
			document.appendChild(plata);

			ime.appendChild(document.createTextNode(vraboten.getIme()));
			prezime.appendChild(document.createTextNode(vraboten.getPrezime()));
			plata.appendChild(document.createTextNode(vraboten.getPlata()));

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);

			StreamResult rezultat = new StreamResult(new File(fileName));
			transformer.transform(source, rezultat);

			System.out.println("Fajlot e kreiran, imeto e: " + fileName);
			System.out.println("Fajlot e zachuvan.");
		}

		catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
