package lu.innoviction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name="CATEGORY")
public class Category {

	// Primary key. It uses auto increment 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)			
    private int id;															
    
    // The category name. Has max 100 characters
    @Column(length=100)
    private String name;													
    
  
    // Used to get the total number of robots that this category contains.
    @Formula("(SELECT count(*) FROM robot c where c.cat_id = id)")    
    private int totalRobots;
    
    
    public Category() {
    	this.name   = "";
    	this.id     = 0;
    	this.totalRobots = 0;
    }

	public Category(String name) {
		super();
		this.name = name;
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
		
	/**
	 * getter for the property totalRobots
	 * @return
	 */
    public int getChildCount() {
        return this.totalRobots;
    }	
    
}
