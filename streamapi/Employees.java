package streamapi;

public class Employees {
	int eid;
	String ename;
	double salary;
	String designation;
	int age;

	public Employees(int eid, String ename, double salary, String designation, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", age=" + age + "]";
	}

}
