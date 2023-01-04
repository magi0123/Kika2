package ListaINiza;

import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {

		MetodiZaListaNiza x = new MetodiZaListaNiza();

		List<String> lista = new ArrayList<String>();
		lista.add("Matematika");
		lista.add("Geografija");

		x.ListaVoNiza(lista);

		String[] niza = { "Istorija", "Makedonski", "Germanski" };
		x.NizaVoLista(niza);

	}

}
