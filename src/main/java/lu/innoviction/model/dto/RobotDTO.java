package lu.innoviction.model.dto;

import java.util.ArrayList;
import java.util.List;

import lu.innoviction.model.Category;
import lu.innoviction.model.Photo;
import lu.innoviction.model.Robot;

public class RobotDTO implements DataTransferObject {

	private static final long serialVersionUID = 322218260908856651L;

	private int id;	
	private String name;
	private String description;
	private double price;
	private List<Photo> photos;
	private Category category;

	public RobotDTO(Robot robot) {
		this.id = robot.getId();
		this.name = robot.getName();
		this.description = robot.getDescription();
		this.price = robot.getPrice();
		this.photos = new ArrayList<Photo>(robot.getPhotos());
		this.category = robot.getCategory();
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

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	
}
