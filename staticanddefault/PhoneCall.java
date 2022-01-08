package staticanddefault;

public interface PhoneCall {

	void busyMessage();

	default void covidAlert() {
		System.out.println("Amitabh Bachchan is speaking !");
	}
}
