package lu.innoviction.controller;

import lu.innoviction.response.APIResponse;

public abstract class ApplicationController {
	
	protected APIResponse successResponse(Object data) {
		APIResponse res = new APIResponse();
		if(data != null) {
			res.setData(data);
		}		
		return res;		
	}
	protected APIResponse errorResponse(String err, Object data) {
		APIResponse res = this.successResponse(data);
		res.setError(err);
		return res;
	}
	

}
