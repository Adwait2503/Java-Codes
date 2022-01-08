package boygirl;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Girl girl = new Girl();
		girl.setGid(1);
		girl.setName("Ash");
		Boy boy = new Boy();
		boy.setBid(101);
		boy.setName("Abhishek");
		Boy boy2 = new Boy();
		boy2.setBid(102);
		boy2.setName("Vivek");
		Boy boy3 = new Boy();
		boy3.setBid(103);
		boy3.setName("Selmon");
		List<Boy> asList = Arrays.asList(boy, boy2, boy3);
		girl.setBoys(asList);
//		girl.setB(boy);
		boy.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(boy);
		createEntityManager.persist(boy2);
		createEntityManager.persist(boy3);
		createEntityManager.persist(girl);
		transaction.commit();
	}

}
