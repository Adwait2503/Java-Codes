package object;

public class ObjectDemo {
int id;

	public ObjectDemo(int id) {
	super();
	this.id = id;
}

	@Override
	public String toString() {
		return "Be ready for Mock "+hashCode();
	}

	public int hashCode() {
		return id++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDemo d = new ObjectDemo(1);
		System.out.println(d);//implisitlly calls toString().
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		ObjectDemo d1 = new ObjectDemo(1);
		System.out.println(d1);
		System.out.println(d1.hashCode());
	}

}
