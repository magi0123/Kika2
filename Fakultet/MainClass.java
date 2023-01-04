package Fakultet;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Fakultet> lista = new ArrayList<Fakultet>();
		lista.add(new Fakultet("FIKT", 10, 500));
		lista.add(new Fakultet("FEIT", 4, 400));
		lista.add(new Fakultet("PMF", 6, 900));
		lista.add(new Fakultet("FON", 7, 300));
		lista.add(new Fakultet("FINKI", 8, 200));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getFakultet());
			System.out.println(lista.get(i).getSmerovi());
			System.out.println(lista.get(i).getStudenti());
		}

	}

}
