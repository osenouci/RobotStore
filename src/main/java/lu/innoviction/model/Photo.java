package lu.innoviction.model;


import java.net.MalformedURLException;
import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PHOTO")
public class Photo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
    @Column(length=2083, nullable = false)
	private String url;
	
	public Photo() {
	}	
	
	public Photo(int id, String url) throws MalformedURLException {
		this.url = new URL(url).toString();
		this.id  = id;
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
	public void setUrl(String url) throws MalformedURLException {
		
		this.url = new URL(url).toString();
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + "]";
	}
	
}
