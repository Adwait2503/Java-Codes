package manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars cars = new Cars();
		cars.setCompany("Toyota");
		cars.setModle("AE 86");

		Cars cars2 = new Cars();
		cars2.setCompany("Toyota");
		cars2.setModle("GT 86");

		Cars cars3 = new Cars();
		cars3.setCompany("TATA");
		cars3.setModle("Tamo");
		List<Cars> list = Arrays.asList(cars, cars2, cars3);

		Owener owener = new Owener();
		owener.setOwenerName("Takumi");

		Owener owener2 = new Owener();
		owener2.setOwenerName("Takeshi");

		Owener owener3 = new Owener();
		owener3.setOwenerName("Ryuji");

		List<Owener> asList = Arrays.asList(owener, owener2, owener3);

		cars.setOwener(asList);
		cars2.setOwener(asList);
		cars3.setOwener(asList);

		owener.setCars(list);
		owener2.setCars(list);
		owener3.setCars(list);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("many2many");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(cars);
		manager.persist(cars2);
		manager.persist(cars3);
		manager.persist(owener);
		manager.persist(owener2);
		manager.persist(owener3);
		transaction.commit();
	}

}
