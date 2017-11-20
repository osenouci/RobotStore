package lu.innoviction.model.dto;
import lu.innoviction.model.Robot;

/***
 * Data transfer object for the robot model.
 * @author OthmaneSENOUCI
 */
public class RobotLightDTO implements DataTransferObject {

	private static final long serialVersionUID = 5193770339418220274L;
	protected static final int maxShortDescriptionLength = 160;
	
	private int id;	
	private String name;
	private String description;
	private double price;
	private String photo;
	private int categoryId;
	
	/**
	 * Constructor that takes a Robot and uses its property to initialize its values.
	 * @param robot
	 */
	public RobotLightDTO(Robot robot) {

		this.id = robot.getId();
		this.name = robot.getName();
		this.price = robot.getPrice();
		this.categoryId = robot.getCategory().getId();
	
		// Get a short description
		int max = robot.getDescription().length() > RobotLightDTO.maxShortDescriptionLength ? RobotLightDTO.maxShortDescriptionLength : robot.getDescription().length();
		this.description = robot.getDescription().substring(0, max);

		// Get a single photo
		this.photo = robot.getPhotos().size() > 0 ? robot.getPhotos().get(0).getUrl() : "";
	}
	/**
	 * Getter for the category property
	 * @return
	 */
	public int getCategoryId() {
		return categoryId;
	}
	/**
	 * Setter for the category property
	 * @param category
	 */	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	public String getPhoto() {
		return photo;
	}
	/**
	 * Setter for the photos property
	 * @param photos
	 */	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
