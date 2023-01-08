package XMLtreta;

import java.util.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		List<Vraboten> v = new ArrayList<Vraboten>();
		v.add(new Vraboten("Stefan", "Stefanovski", "10000"));
		v.add(new Vraboten("Aleksandar", "Ristevski", "15000"));
		v.add(new Vraboten("Igor", "Zavojchevski", "20000"));

		XML xml = new XML();
		xml.createXMLFile("xml.xml", v);
	}

}
