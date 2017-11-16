package lu.innoviction.model.dto;

import lu.innoviction.validation.URL;

public class PhotoDTO {

	@URL(message="Invalid URL")
	private String url;

	public PhotoDTO() {
		super();
	}		
	public PhotoDTO(String url) {
		super();
		this.url = url;
	}		
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
