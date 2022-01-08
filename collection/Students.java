package collection;

public class Students {
	
	int roll;
	String name;
	double perce;
	
	public Students(int roll, String name, double perce) {
		super();
		this.roll = roll;
		this.name = name;
		this.perce = perce;
	}
	@Override
	
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", perce=" + perce + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return super.hashCode();
	}
}
