package lu.innoviction.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lu.innoviction.model.Robot;
import lu.innoviction.model.dto.RobotDTO;
import lu.innoviction.model.dto.RobotLightDTO;
import lu.innoviction.repository.RobotRepository;

/***
 * Used to perform GRUD operations on the Robot entity.
 * @author OthmaneSENOUCI
 *
 */
@Validated
@Service
public class RobotService {
	
	@Autowired
	private RobotRepository robotRepository;
		
	/**
	 * Gets the list of robots stored in the database. It lists all the items.
	 * @return List<Robot>
	 */
	public List<Robot> findAll() {		
		List<Robot> robotList = new ArrayList<Robot>();
		this.robotRepository.findAll().forEach(robotList::add);
		return robotList;
	}
	/**
	 * Gets the list of robots stored in the database as Light DTO. The light DTO has only one image instead of an array of images.
	 * @return List<RobotLightDTO>
	 */	
	public List<RobotLightDTO> findAllAsDTO() {		
		List<RobotLightDTO> list = new ArrayList<>();
		this.robotRepository.findAll().forEach(robot -> { System.out.println(robot); list.add(new RobotLightDTO(robot)); });
		return list;
	}	
	/**
	 * Gets the list of robots stored in the database as Light DTO using their category id. The light DTO has only one image instead of an array of images.
	 * @return List<RobotLightDTO>
	 */		
	public List<RobotLightDTO> findByCategory(int categoryId) {
		List<RobotLightDTO> list = new ArrayList<>();
		this.robotRepository.findRobotsByCategoryId(categoryId).forEach(robot -> { System.out.println(robot); list.add(new RobotLightDTO(robot)); });
		return list;
	}
	/***
	 * Adds a new item to the collection. Does not perfom validation.
	 * @param robot
	 */
	public void save(Robot robot) {
		this.robotRepository.save(robot);
	}
	/***
	 * Adds a new item to the collection. It performs validation using DTOs.
	 * @param robotDTO
	 */
	public void save(@Valid RobotDTO robotDTO) {
		this.robotRepository.save(new Robot(robotDTO));
	}	
	/**
	 * Deletes an entry from the data base using it's primary key (id)
	 * @param id
	 */
	public void delete(int id) {
		this.robotRepository.delete(id);
	}
	public Robot findOne(int id) {
		return this.robotRepository.findOne(id);
	}
	/**
	 * Finds a single robot and returns a DTO 
	 * @param id
	 */	
	public RobotDTO findOneAsDTO(int id) {
		Robot robot = this.robotRepository.findOne(id);
		return null == robot ? null : new RobotDTO(robot);
	}	

}
