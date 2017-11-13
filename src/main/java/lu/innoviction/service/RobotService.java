package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.innoviction.domain.CategoryRepository;
import lu.innoviction.domain.Photo;
import lu.innoviction.domain.PhotoRepository;
import lu.innoviction.domain.Robot;
import lu.innoviction.domain.RobotRepository;
import lu.innoviction.domain.Category;

@Service
public class RobotService {
	@Autowired
	private RobotRepository robotRepository;
	@Autowired
	private PhotoRepository photoRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category listByCategory(int categoryId) {
		return this.categoryRepository.findOne(categoryId);
	}
	
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
	public void delete(int id) {
		this.robotRepository.delete(id);
	}
	public Robot get(int id) {
		return this.robotRepository.findOne(id);
	}
}
