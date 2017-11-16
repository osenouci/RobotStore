package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.innoviction.model.Category;
import lu.innoviction.model.dto.CategoryDTO;
import lu.innoviction.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
		
	public List<Category> findAll() {
		
		List<Category> categories = new ArrayList<Category>();
		this.categoryRepository.findAll().forEach(categories::add);
		return categories;
	}	
	public List<CategoryDTO> findAllAsDTO(){
		List<CategoryDTO> list = new ArrayList<>();
		this.categoryRepository.findAll().forEach(cat -> list.add(new CategoryDTO(cat)));
		return list;
	}

}
