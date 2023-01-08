package mapa;

import java.util.Map;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		Map<String, String> recnik = new HashMap<String, String>();
		recnik.put("hi", "zdravo");
		recnik.put("book", "kniga");
		recnik.put("sneakers", "patiki");
		recnik.put("ring", "prsten");
		recnik.put("game", "igra");

		System.out.println(recnik.keySet());
		System.out.println(recnik.values());

		for (Map.Entry<String, String> entry : recnik.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		if (recnik.containsKey("hi")) {
			System.out.println("Vrednosta na 'hi' e: " + recnik.get("hi"));

		} else
			System.out.println("Ne postoi zbor hi.");
	}

}
