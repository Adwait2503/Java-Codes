package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cars {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carTag;
	private String company;
	private String modle;

	@ManyToMany(mappedBy = "cars")
	private List<Owener> owener;

	public int getCarTag() {
		return carTag;
	}

	public void setCarTag(int carTag) {
		this.carTag = carTag;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModle() {
		return modle;
	}

	public void setModle(String modle) {
		this.modle = modle;
	}

	public List<Owener> getOwener() {
		return owener;
	}

	public void setOwener(List<Owener> owener) {
		this.owener = owener;
	}

	@Override
	public String toString() {
		return "Cars [carTag=" + carTag + ", company=" + company + ", modle=" + modle + ", owener=" + owener + "]";
	}

}
