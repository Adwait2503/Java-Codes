package foreachmethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("============");
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("===========");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===========From ForEachMethod");
		arrayList.forEach(System.out::println);
	}

}
