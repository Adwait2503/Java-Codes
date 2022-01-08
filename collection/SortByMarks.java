package collection;

import java.util.Comparator;

public class SortByMarks implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return (int) (o2.perce-o1.perce);
	}

}
