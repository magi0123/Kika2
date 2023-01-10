package mapaRecnik;

import java.util.Map;
import java.util.HashMap;

public class Recnik {

	Map<String, String> recnik = new HashMap<String, String>();

	public Recnik() {
		recnik.put("1", "Ponedelnik");
		recnik.put("2", "Vtornik");
		recnik.put("3", "Sreda");

		System.out.println("Mapa: " + recnik);

	}

	public void novElement(String x, String y) {
		recnik.put(x, y);
	}

	public void translate(String s) {
		if (recnik.containsKey(s)) {
			System.out.println(recnik.get(s));
		} else {
			System.out.println("Ne postoi takov zbor vo recnikot");

		}
	}
}
