package lu.innoviction.model.dto;

import javax.validation.constraints.Size;

import lu.innoviction.model.Category;

public class CategoryDTO implements DataTransferObject {

	private static final long serialVersionUID = 8296381013428002056L;

	private int id;

	@Size(min = 10, max = 100, message = "The category name should be within 10 to 100 characters long")
    private String name;
    private int total;
    
    public CategoryDTO(Category category) {
    	this.id   = category.getId();
    	this.name = category.getName();
    	this.total= category.getChildCount();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getTotal() {
		return total;
	}
	
}
