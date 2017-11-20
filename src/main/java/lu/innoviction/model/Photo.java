package lu.innoviction.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/***
 * The photo entity. A given robot can have 0 or many photos
 * @author OthmaneSENOUCI
 *
 */
@Entity
@Table(name="PHOTO")
public class Photo {
	
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prd_seq")
	@SequenceGenerator(name = "prd_seq", sequenceName = "prd_sequence", allocationSize = 20)    
    //    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    
    //@URL(message="Invalid image URL. Please verify the URL(s) that you have submitted")
    @Column(length=2083)
	private String url;
	
	public Photo() {
	}	
	public Photo(String url) {
		this.url = url;
	}	
	public Photo(int id, String url) {
		this.id  = id;
		this.url = url;
	}

	/***
	 * Getter for the property id
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/***
	 * Setter for the property id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter for the property url
	 * @return
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Setter for the property url
	 * @param url
	 */	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + "]";
	}
	
}
