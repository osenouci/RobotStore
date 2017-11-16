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
	public List<RobotLightDTO> findAllAsDTO() {		
		List<RobotLightDTO> list = new ArrayList<>();
		this.robotRepository.findAll().forEach(robot -> { System.out.println(robot); list.add(new RobotLightDTO(robot)); });
		return list;
	}	
	public List<RobotLightDTO> findByCategory(int categoryId) {
		List<RobotLightDTO> list = new ArrayList<>();
		this.robotRepository.findRobotsByCategoryId(categoryId).forEach(robot -> { System.out.println(robot); list.add(new RobotLightDTO(robot)); });
		return list;
	}
	/***
	 * Adds a new item to the collection.
	 * @param robot
	 */
	public void save(Robot robot) {
		this.robotRepository.save(robot);
	}
	public void save(@Valid RobotDTO robotDTO) {
		this.robotRepository.save(new Robot(robotDTO));
	}	
	
	public void delete(int id) {
		this.robotRepository.delete(id);
	}
	public Robot findOne(int id) {
		return this.robotRepository.findOne(id);
	}
	public RobotDTO findOneAsDTO(int id) {
		Robot robot = this.robotRepository.findOne(id);
		return null == robot ? null : new RobotDTO(robot);
	}	

}
