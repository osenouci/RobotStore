package lu.innoviction.response;

import java.util.ArrayList;

public class APIResponse {

	protected Object data;
	protected boolean status;
	protected Object error;
	
	public APIResponse() {
		this.data   = new ArrayList<Object>();
		this.status = true;
		this.error  = new ArrayList<>();
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.status = false;
		this.error = error;
	}
}
