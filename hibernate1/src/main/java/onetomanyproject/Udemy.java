package onetomanyproject;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Udemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setNumOfCources(1);

		Product product = new Product();
		product.setCourseName("NFT Fundamentals");
		product.setPrice(3499);
		Product product2 = new Product();
		product2.setCourseName("Python");
		product2.setPrice(4499);
		Product product3 = new Product();
		product3.setCourseName("Java Programming Masterclass");
		product3.setPrice(3499);
		List<Product> asList = Arrays.asList(product, product2, product3);
		product.setCart(cart);
		product2.setCart(cart);
		product3.setCart(cart);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("many2many");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(product);
		manager.persist(product2);
		manager.persist(product3);
		manager.persist(cart);
		transaction.commit();
	}

}
