package lu.innoviction.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lu.innoviction.model.dto.RobotDTO;


@Entity
@Table(name="ROBOT")
public class Robot {
	
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prd_seq")
	@SequenceGenerator(name = "prd_seq", sequenceName = "prd_sequence", allocationSize = 20, initialValue = 100)    
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    // The robot name has the max length of 512 and it is unique
	@Column(length=512, unique=true)
	private String name;
    
	// The description field's max length is 5000 
	@Column(length=5000)
	private String description;
    
	// Robot's price
	private double price;

	// A robot has zero or more photos
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="ROB_ID")
	private List<Photo> photos;
	
	// A robot belongs to a category
	@ManyToOne(cascade=CascadeType.DETACH, targetEntity=Category.class)
    @JoinColumn(name = "CAT_ID")
	private Category category;
	
	public Robot() {
		super();
		this.photos = new ArrayList<>();
	}
	public Robot(RobotDTO dto) {
		super();
		this.name = dto.getName();
		this.description = dto.getDescription();
		this.price = dto.getPrice();		
		this.category = dto.getCategory();

		this.photos = new ArrayList<>();
		dto.getPhotos().stream().forEach(photoDTO -> this.photos.add(new Photo(photoDTO.getUrl())));
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
		
		this.photos = new ArrayList<>();
	}	

	/***
	 * Getter for the photos property
	 * @return
	 */
	public List<Photo> getPhotos() {
		return photos;
	}

	/**
	 * Setter for the photos property
	 * @param photos
	 */
	public void setPhotos(List<Photo> photos) {
		this.photos =  new ArrayList<Photo>(photos);
	}

	/***
	 * Getter for the id property
	 * @return
	 */
	public int getId() {
		return id;
	}

	/***
	 * Setter for the id property
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/***
	 * Getter for the name property
	 * @return
	 */
	public String getName() {
		return name;
	}

	/***
	 * Setter for the description property
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/***
	 * Getter for the description property
	 * @return
	 */
	public String getDescription() {
		return description == null || description.isEmpty() ? "" : description;
	}

	/**
	 * Setter for the description property
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/***
	 * Getter for the price category property
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter for the price property
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/***
	 * Setter for the category property
	 * @return
	 */
	public Category getCategory() {
		return category;
	}
	
	/**
	 * Getter for the category property
	 * @param category
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", total photos="
				+ photos + "]";
	}
	
}
