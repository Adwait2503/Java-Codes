package onetomanyproject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	private int numOfCources;

	@OneToMany(mappedBy = "cart")
	private List<Product> product;

	public int getNumOfCources() {
		return numOfCources;
	}

	public void setNumOfCources(int numOfCources) {
		this.numOfCources = numOfCources;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [numOfCources=" + numOfCources + ", product=" + product + "]";
	}

}
