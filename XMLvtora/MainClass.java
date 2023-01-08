package XMLvtora;

public class MainClass {

	public static void main(String[] args) {
		Vraboten vraboten = new Vraboten();
		vraboten.setIme("Magdalena");
		vraboten.setPrezime("Apostolovska");
		vraboten.setPlata("18000");

		XML xml = new XML();
		xml.createFile("xml.xml", vraboten);
		System.out.println();

	}

}
