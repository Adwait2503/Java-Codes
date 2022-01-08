package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList();
		Employee employee = new Employee(1, "Vivek", 100001);
		list.add(employee);
		list.add(new Employee(2, "Loki", 100000));
		list.add(new Employee(3, "Thor", 20000));
		list.set(1, new Employee(2, "Odin", 100000000));
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println("=================");
		Collections.sort(list);
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("=================");
		Collections.sort(list,new SortBySalary());
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println("=================");
		Collections.sort(list,new SortByName());
		for(Employee e:list) {
			System.out.println(e);
		}
	}

}
