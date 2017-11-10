package lu.innoviction.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Robot {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length=512, unique=true)
	private String name;
	
	@Column(length=5000)
	private String description;
	private double price;

	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="ROB_ID")
	private List<Photo> photos;

	public Robot() {
		super();
	}
	public Robot(int id, String name, String description, double price, List<Photo> photos) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.photos = new ArrayList<Photo>(photos);
	}
	public Robot(int id, String name, String description, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}	

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos =  new ArrayList<Photo>(photos);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", total photos="
				+ photos + "]";
	}
	
}