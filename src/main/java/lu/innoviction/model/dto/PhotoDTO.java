package lu.innoviction.model.dto;

import lu.innoviction.validation.URL;

/***
 * Data transfer object for the Photo model.
 * @author OthmaneSENOUCI
 */
public class PhotoDTO {

	// Data validation for the URL
	@URL(message="Invalid URL")
	private String url;

	public PhotoDTO() {
		super();
	}		
	public PhotoDTO(String url) {
		super();
		this.url = url;
	}		
	
	/***
	 * Getter for the URL property
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter for the URL property
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
}
