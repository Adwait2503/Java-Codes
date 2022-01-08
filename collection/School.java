package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Students> hashSet = new HashSet<>();
		hashSet.add(new Students(1, "Aayush", 78.25));
		hashSet.add(new Students(23, "Rakshit", 81.92));
		hashSet.add(new Students(25, "Adwait", 70.18));
		Students students2 = new Students(1, "Aayush", 78.25);
		hashSet.add(students2);//Should not happen.
		ArrayList<Students> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList, new SortByRoll());
		Iterator<Students> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Students students = (Students) iterator.next();
			System.out.println(students);
		}
		System.out.println("===================");
		Iterator<Students> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			Students students = (Students) iterator2.next();
			System.out.println(students);

		}

	}

}
