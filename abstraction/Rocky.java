package abstraction;

public class Rocky extends Dog {

	public Rocky(int nails, double weight, String breed) {
		super(nails, weight, breed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("It Barks...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat Eats...");
	}

}
