package presek;

import java.util.List;
import java.util.ArrayList;

public class ppp {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("bela");
		lista.add("crna");
		lista.add("zelena");

		List<String> lista1 = new ArrayList<>();
		lista1.add("crvena");
		lista1.add("crna");
		lista1.add("bela");
		
		lista.retainAll(lista1);
		System.out.println(lista);
	}

}
