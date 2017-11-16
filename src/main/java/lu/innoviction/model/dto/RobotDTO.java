package lu.innoviction.model.dto;


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
	
    @Size(min = 10, max = 100, message = "The name field should be within 10 to 100 characters long")
	private String name;

    @Size(min = 10, max = 5000, message = "The description field should be within 10 to 5000 characters long")
	private String description;
    
    @DecimalMax(value = "100000", message = "The decimal value for the price field can not be more than 100000.00 digit")
    @DecimalMin(value = "1.00", message = "The decimal value for the price field  can not be less than 1.00 digit")    
	private double price;
    
    @Valid
    @Size(min = 0, max = 20, message = "A product can have at most 20 photos.")    
	private List<PhotoDTO> photos;
	
	@NotNull(message = "Please select a category")
	private Category category;

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
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public List<PhotoDTO> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoDTO> photos) {
		this.photos = photos;
	}

}
