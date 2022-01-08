package encapsulation;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee1 = new Employee();
employee1.setAge(21);
employee1.setempId(1);
employee1.setName("Rimuru");
employee1.setDesignation("Software Developer");
System.out.println(employee1.getEmpId());
System.out.println(employee1.getName());
System.out.println(employee1.getAge());
System.out.println(employee1.getDesignation());

	}

}
