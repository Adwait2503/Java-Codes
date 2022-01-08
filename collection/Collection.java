package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(30);
		list.add(10);
		list.add(20);
		//list.add('a');
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
