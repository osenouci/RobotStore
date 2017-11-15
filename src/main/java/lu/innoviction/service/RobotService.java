package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.innoviction.model.Robot;
import lu.innoviction.repository.RobotRepository;

@Service
public class RobotService {
	
	@Autowired
	private RobotRepository robotRepository;
		
	/**
	 * Gets the list of robots stored in the database. It lists all the items.
	 * @return List<Robot>
	 */
	public List<Robot> list() {		
		List<Robot> robotList = new ArrayList<Robot>();
		this.robotRepository.findAll().forEach(robotList::add);
		return robotList;
	}
	/***
	 * Adds a new item to the collection.
	 * @param robot
	 */
	public void add(Robot robot) {
		this.robotRepository.save(robot);
	}
	public void delete(int id) {
		this.robotRepository.delete(id);
	}
	public Robot get(int id) {
		return this.robotRepository.findOne(id);
	}
}
