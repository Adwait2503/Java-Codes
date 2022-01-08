package abstraction;

public abstract class Dog {
	int nails;
	double weight;
	String breed;

	public Dog(int nails, double weight, String breed) {
		this.nails = nails;
		this.weight = weight;
		this.breed = breed;
	}

	abstract public void bark();

	abstract public void eat();
}
