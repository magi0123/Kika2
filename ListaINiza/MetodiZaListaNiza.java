package ListaINiza;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MetodiZaListaNiza {

	public void ListaVoNiza(List<String> lista) {
		String[] niza = new String[lista.size()];
		lista.toArray(niza);
		System.out.println("Lista vo niza:");
		for (String s : niza) {
			System.out.println(s);

		}

	}

	public void NizaVoLista(String[] niza) {
		List<String> lista = new ArrayList<String>();
		lista = Arrays.asList(niza);
		System.out.println("Niza vo lista:");
		for (String s : lista) {
			System.out.println(s);
		}
	}

}
