package lu.innoviction.repository;

import org.springframework.data.repository.CrudRepository;

import lu.innoviction.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}