package lu.innoviction.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Photo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String url;
	
//	@ManyToOne
//	@JoinColumn(name="ROB_ID", nullable=false)
//	private Robot robot;	
	
/*	public Robot getRobot() {
		return robot;
	}
	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	*/
	public Photo() {
	}	
	
	public Photo(int id, String url) {
		this.url = url;
		this.id  = id;
	//	this.robot = robot;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + "]";
	}
	
	
	
	
}
