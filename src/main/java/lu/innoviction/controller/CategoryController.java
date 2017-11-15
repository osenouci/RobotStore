package lu.innoviction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.model.Category;
import lu.innoviction.repository.CategoryRepository;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/category")
	private List<Category> getCategories() {
		return null;
	}	
	
}
