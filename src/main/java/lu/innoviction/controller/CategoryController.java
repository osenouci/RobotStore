package lu.innoviction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.response.APIResponse;
import lu.innoviction.service.CategoryService;

/**
 * A reset controller that has a single route used to get the robot category.
 * @author OthmaneSENOUCI
 */
@RestController
public class CategoryController extends ApplicationController {

	@Autowired
	CategoryService categoryService;

	/**
	 * @return APIResponse containing that list of category DTOs as the data property
	 */
	@GetMapping("/category")
	private APIResponse getCategories() {
		return this.successResponse(this.categoryService.findAllAsDTO());
	}	
	
}
