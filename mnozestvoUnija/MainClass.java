package mnozestvoUnija;

import java.util.Set;
import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set1.add("d");
		
		set.addAll(set1);
		System.out.println(set);
	}
}
