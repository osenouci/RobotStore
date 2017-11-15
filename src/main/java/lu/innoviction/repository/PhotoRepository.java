package lu.innoviction.repository;
import org.springframework.data.repository.CrudRepository;

import lu.innoviction.model.Photo;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {
}