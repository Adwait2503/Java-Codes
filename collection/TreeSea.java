package collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(-4);
		treeSet.add(12);
		treeSet.add(0);
		treeSet.add(87);
		for (Object obj : treeSet) {
			System.out.println(obj);
		}
		System.out.println("=================");
		ArrayList<Object> arrayList = new ArrayList<>(treeSet);
		ListIterator<Object> listIterator = arrayList.listIterator(arrayList.size());
		while (listIterator.hasPrevious()) {
			Object object = (Object) listIterator.previous();
			System.out.println(object);
		}
	}

}
