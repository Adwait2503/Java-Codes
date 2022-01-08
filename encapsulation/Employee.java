package encapsulation;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private static String designation;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			System.out.println("Invalid Input!!!");
		}
	}

	public void setempId(int empId) {
		this.empId = empId;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}
}
