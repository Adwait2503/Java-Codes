package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ads");
		list.add(10);
		list.add(true);
		list.add(11.21);
		ArrayList arr = new ArrayList();
		arr.add(list);
		arr.add("Hello");
		arr.add(false);
		Iterator it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		System.out.println(arr);
		System.out.println(arr.size());
	}

}
