package lu.innoviction.controller;

import lu.innoviction.response.APIResponse;


/**
 * An abstract class that other controllers should extend. It contains methods used to format the response.
 * @author OthmaneSENOUCI
 */
public abstract class ApplicationController {
	
	/***
	 * Used to return a success response in the form of a JSON object {status: true, data:any, error:null}
	 * @param data the data to send back in the client as part of response.
	 * @return APIResponse simple class that is used to structure the response.
	 */
	protected APIResponse successResponse(Object data) {
		APIResponse res = new APIResponse();
		if(data != null) {
			res.setData(data);
		}		
		return res;		
	}
	/***
	 * Used to return a failed response in the form of a JSON object {status: false, data:any, error:Array|string}
	 * @param data the data to send back in the client as part of response.
	 * @return APIResponse simple class that is used to structure the response.
	 */	
	protected APIResponse errorResponse(String err, Object data) {
		APIResponse res = this.successResponse(data);
		res.setError(err);
		return res;
	}

}
