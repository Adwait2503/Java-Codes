package collection;

import java.util.Comparator;

public class SortByRoll implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.roll - o2.roll;
	}

}
