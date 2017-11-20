package lu.innoviction.model.dto;

import javax.validation.constraints.Size;

import lu.innoviction.model.Category;

/***
 * Data transfer object for the category model.
 * @author OthmaneSENOUCI
 */
public class CategoryDTO implements DataTransferObject {

	private static final long serialVersionUID = 8296381013428002056L;

	private int id;

	// Validate the name and define the error message
	@Size(min = 10, max = 100, message = "The category name should be within 10 to 100 characters long")
    private String name;
    private int total;
    
    public CategoryDTO(Category category) {
    	this.id   = category.getId();
    	this.name = category.getName();
    	this.total= category.getChildCount();
    }
    
	/**
	 * Getter for the property id
	 * @return
	 */    
    public int getId() {
		return id;
	}
	/**
	 * Setter for the property id
	 * @return
	 */    
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Getter for the property name
	 * @return
	 */	
	public String getName() {
		return name;
	}
	/**
	 * setter for the property name
	 * @return
	 */	
	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * getter for the property total property. It is used to tell how many robots belong to the category.
	 * @return
	 */	
	public int getTotal() {
		return total;
	}
	
}
