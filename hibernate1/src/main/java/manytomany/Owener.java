package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Owener {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oId;
	private String owenerName;
	@ManyToMany
	private List<Cars> cars;

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getOwenerName() {
		return owenerName;
	}

	public void setOwenerName(String owenerName) {
		this.owenerName = owenerName;
	}

	public List<Cars> getCars() {
		return cars;
	}

	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Owener [oId=" + oId + ", owenerName=" + owenerName + ", cars=" + cars + "]";
	}

}
