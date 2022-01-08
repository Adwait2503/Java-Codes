package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(2);// to access the previous class give previous class name and I have given this
											// as arrayList because i wanted to sort it
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(85);
		list.add(55);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("===========================");
		list.remove(1);
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
