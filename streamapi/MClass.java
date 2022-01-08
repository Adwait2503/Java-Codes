package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> list = Arrays.asList(new Employees(1, "Anurag", 20000, "Developer", 23),
				new Employees(2, "Harshad", 30000, "Senior Developer", 25),
				new Employees(3, "Aayush", 50000, "Dev Ops", 25), new Employees(5, "Rakshit", 100000, "GM", 27));
		Employees e = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (e.getAge() > list.get(i).getAge()) {
				e = list.get(i);
			}
		}
		System.out.println(e);
		System.out.println("================");
		Stream<Employees> stream = list.stream();
		Optional<Employees> min = stream.min(Comparator.comparing(Employees::getAge));
		System.out.println(min);
		System.out.println("================");
		list.stream().max(Comparator.comparing(Employees::getSalary)).ifPresent(System.out::println);
		list.stream().sorted(Comparator.comparing(Employees::getEname)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("===============");
		list.stream().sorted(Comparator.comparing(Employees::getSalary)).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("===============");
		Map<String, List<Employees>> collect = list.stream().collect(Collectors.groupingBy(Employees::getDesignation));
		collect.forEach((department, emp) -> {
			System.out.println(department);
			emp.forEach(System.out::println);
		});
		System.out.println("===============");
		list.stream().filter(em -> em.getSalary() > 30000).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("===============");
		boolean b = list.stream().anyMatch(em -> em.getAge() < 20);
		System.out.println(b);
	}

}
