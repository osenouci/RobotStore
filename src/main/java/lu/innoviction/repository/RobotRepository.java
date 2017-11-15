package lu.innoviction.repository;

import org.springframework.data.repository.CrudRepository;

import lu.innoviction.model.Robot;

public interface RobotRepository extends CrudRepository<Robot, Integer> {
	
}
