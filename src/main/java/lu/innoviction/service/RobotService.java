package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.innoviction.domain.Photo;
import lu.innoviction.domain.PhotoRepository;
import lu.innoviction.domain.Robot;
import lu.innoviction.domain.RobotRepository;

@Service
public class RobotService {
	
	@Autowired
	private RobotRepository robotRepository;
	
	@Autowired
	private PhotoRepository photoRepository;
	
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
	
	public List<Photo> listPhotos() {
		
		List<Photo> photos = new ArrayList<Photo>();
		this.photoRepository.findAll().forEach(photos::add);
		return photos;
	}
	
	
	public void delete(long id) {
		
		
	}
	public Robot get(long id) {
	
		
		return null;
	}
	
	public void update(long id, Robot robot) {
		
		
	}

}
