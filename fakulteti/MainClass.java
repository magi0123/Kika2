package fakulteti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<String> fakulteti = new ArrayList<>();
		fakulteti.add("FINKI");
		fakulteti.add("FIKT");
		fakulteti.add("PMF");
		Collections.sort(fakulteti);
		System.out.println("Prvobitna lista:" + fakulteti);

		if (fakulteti.size() == 3) {
			fakulteti.add("TMF");
			fakulteti.add("FON");
			System.out.println("Ako ima tri elementi + 2" + fakulteti);
		} else {
			System.out.println("Ako nema tri prvobitnata lista" + fakulteti);
		}

		fakulteti.remove(0);
		System.out.println("So izbrisan prv element" + fakulteti);
		fakulteti.add(2, "FEIT");
		System.out.println("Dodaden element na tretata pozicija" + fakulteti);
		System.out.println("elementi:" + fakulteti.size());

	}

}
