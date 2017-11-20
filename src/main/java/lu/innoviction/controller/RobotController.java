package lu.innoviction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.model.dto.RobotDTO;
import lu.innoviction.response.APIResponse;
import lu.innoviction.service.RobotService;


/**
 * Rest controller used to perform GRUD operations on the robot entity.
 * @author OthmaneSENOUCI
 *
 */
@RestController
public class RobotController extends ApplicationController {
	
	@Autowired
	private RobotService robotService;
	
	/**
	 * Lists the robots stored in the database.
	 * @return APIResponse containing that list of robots as the data property
	 */
	@GetMapping("/robot")
	public APIResponse list() {
		return this.successResponse(this.robotService.findAllAsDTO());
	}	
	
	/***
	 * Used to store a new robot entry in the database.
	 * @param robot Data transfer object used to validate the data submitted.
	 * @return APIResponse having no data and the status set to true.
	 */
	@PostMapping("/robot")
	public APIResponse add(@RequestBody RobotDTO robot) {
		this.robotService.save(robot);	
		return this.successResponse(null);
	}
	
	/**
	 * Returns a single robot by id.
	 * @param id the id of a robot entry stored in the database.
	 * @return APIResponse having the status equal to true and data equals to RobotDTO or null.
	 */
	@GetMapping("/robot/{id}")
	public APIResponse getOne(@PathVariable int id) {
		return this.successResponse(this.robotService.findOneAsDTO(id));
	}
	
	/**
	 * Used to get a set of robots by category id.
	 * @param id the category id of the robots.
	 * @return APIResponse containing that list of robots as the data property
	 */
	@GetMapping("/robot/category/{id}")
	public APIResponse findByCategoryId(@PathVariable int id) {
		return this.successResponse(this.robotService.findByCategory(id));
	}

	/***
	 * Used to delete a robot from the database.
	 * @param id the id of the robot that we want to delete
	 * @return Standard APIResponse with the status equals to true.
	 */
	@DeleteMapping("/robot/{id}")
	public APIResponse deleteRobot(@PathVariable int id) {
		this.robotService.delete(id);
		return this.successResponse(null);
	}
}