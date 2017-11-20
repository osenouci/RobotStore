package lu.innoviction.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lu.innoviction.model.Robot;

public interface RobotRepository extends CrudRepository<Robot, Integer> {
	List<Robot> findRobotsByCategoryId(int categoryId);	// Find robots by category id
}
