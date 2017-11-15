package lu.innoviction.model.dto;

import lu.innoviction.model.Robot;

public class RobotLightDTO implements DataTransferObject {

	private static final long serialVersionUID = 5193770339418220274L;

	private int id;	
	private String name;
	private String description;
	private double price;
	private String photo;
	
	public RobotLightDTO(Robot robot) {
		this.id = robot.getId();
		this.name = robot.getName();
		this.description = robot.getDescription().substring(0, 60);	// Get only the first 60 characters
		this.price = robot.getPrice();
		this.photo = robot.getPhotos().size() > 0 ? robot.getPhotos().get(0).getUrl() : "";
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
