package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.innoviction.model.Category;
import lu.innoviction.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> listCategories() {
		
		// Convert the categories into data transfer objects
		List<Category> categories = new ArrayList<Category>();
		this.categoryRepository.findAll().forEach(categories::add);
		
		// Send the response to the client
		
		return categories;
	}	

}
