package lu.innoviction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.response.APIResponse;
import lu.innoviction.service.CategoryService;

@RestController
public class CategoryController extends ApplicationController {

	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/category")
	private APIResponse getCategories() {
		return this.successResponse(this.categoryService.findAllAsDTO());
	}	
	
}
