package lu.innoviction.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.response.APIResponse;

/***
 * Rest controller that contains a single method that is used to check if the user credentials are valid or not.
 * @author OthmaneSENOUCI
 */
@RestController
public class UserController extends ApplicationController {

	/***
	 * This is a dummy method used to check if the user credentials are valid or not. If the credentials in the header are correct
	 * then the client will be able to call this method and gets the code 200. Otherwise he gets unauthorized access code.
	 * 
	 * @return APIResponse having the status equal to true.
	 */
	@PostMapping("/login")
	private APIResponse login() {
		return this.successResponse(null);
	}		
}
