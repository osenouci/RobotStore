package lu.innoviction.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.response.APIResponse;

@RestController
public class UserController extends ApplicationController {

	@PostMapping("/login")
	private APIResponse getCategories() {
		return this.successResponse(null);
	}		
}
