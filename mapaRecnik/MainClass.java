package mapaRecnik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Recnik r = new Recnik();
			System.out.println("Vnesi kluc i vrednost:");
			String x = br.readLine();
			String y = br.readLine();
			r.novElement(x, y);
			System.out.println("Vnesi kluc za prebaruvanje:");
			String s = br.readLine();
			System.out.println("Vrednosta na klucot e:");
			r.translate(s);

		}

		catch (IOException e) {
			System.out.println(e.toString());
		}

	}
}
