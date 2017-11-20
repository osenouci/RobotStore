package lu.innoviction.model.dto;

/***
 * Data transfer object for the robot model. Used to validate 
 * @author OthmaneSENOUCI
 */
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lu.innoviction.model.Category;
import lu.innoviction.model.Robot;

public class RobotDTO implements DataTransferObject {

	private static final long serialVersionUID = 322218260908856651L;

	private int id;	
	
	// Validation rule for the name field. Min of 10 and max of 100 characters
    @Size(min = 10, max = 100, message = "The name field should be within 10 to 100 characters long")
	private String name;

    // Validation rule for the description. Min of 10 and max of 5000 characters.
    @Size(min = 10, max = 5000, message = "The description field should be within 10 to 5000 characters long")
	private String description;
    
    // Validation rules for the price. Min of 1 and max of 10000.
    @DecimalMax(value = "100000", message = "The decimal value for the price field can not be more than 100000.00 digit")
    @DecimalMin(value = "1.00", message = "The decimal value for the price field  can not be less than 1.00 digit")    
	private double price;
    
    // Validate the photos. A robot can have the max of 20 photos.
    @Valid
    @Size(min = 0, max = 20, message = "A product can have at most 20 photos.")    
	private List<PhotoDTO> photos;
	
    // The category is mandatory
	@NotNull(message = "Please select a category")
	private Category category;

	/***
	 * The default constructor
	 */
	public RobotDTO() {
		this.photos = new ArrayList<>();
	}
	public RobotDTO(Robot robot) {
		this.id = robot.getId();
		this.name = robot.getName();
		this.description = robot.getDescription();
		this.price = robot.getPrice();
		this.category = robot.getCategory();
		
		this.photos = new ArrayList<>(robot.getPhotos().size());
		robot.getPhotos().stream().forEach(photo -> this.photos.add(new PhotoDTO(photo.getUrl())));
	}	
	
	/**
	 * Setter for the category property
	 * @param category
	 */		
	public Category getCategory() {
		return category;
	}

	/**
	 * Getter for the category property
	 * @return
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * Getter for the id property
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter for the id property
	 * @param id
	 */	
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter for the name property
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name property
	 * @param name
	 */	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the description property
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for the description property
	 * @param description
	 */	
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter for the price property
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

	/**
	 * Getter for the photos property
	 * @return
	 */
	public List<PhotoDTO> getPhotos() {
		return photos;
	}

	/**
	 * Setter for the photos property
	 * @param photos
	 */
	public void setPhotos(List<PhotoDTO> photos) {
		this.photos = photos;
	}

}
