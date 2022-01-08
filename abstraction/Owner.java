package abstraction;

public class Owner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rocky rocky = new Rocky(20, 40.123, "Labradore");
		rocky.bark();
		rocky.eat();
		System.out.println("Weight "+rocky.weight);
		System.out.println("Nails "+rocky.nails);
		System.out.println("Breed "+rocky.breed);
	}

}
