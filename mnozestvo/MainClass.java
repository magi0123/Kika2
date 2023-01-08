package mnozestvo;

import java.util.Set;
import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");

		System.out.println(set);
	}

}
