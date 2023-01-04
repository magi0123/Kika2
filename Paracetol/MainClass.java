package Paracetol;

import java.util.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Analgin");
		l.add("Kafetin");
		l.add("Paracetamol");

		if (l.get(l.size() - 1).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
		} else {
			System.out.println("Namenata na lekot e nepoznata");
		}

	}

}
