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


@RestController
public class RobotController extends ApplicationController {
	
	@Autowired
	private RobotService robotService;
	
	/**
	 * Lists the robots stored in the database.
	 * @return List<Robot>
	 */
	@GetMapping("/robot")
	public APIResponse list() {
		return this.successResponse(this.robotService.findAllAsDTO());
	}	
	
	/***
	 * Used to store a new robot entry in the database.
	 * @param robot
	 */
	@PostMapping("/robot")
	public APIResponse add(@RequestBody RobotDTO robot) {
		this.robotService.save(robot);	
		return this.successResponse(null);
	}
	
	@GetMapping("/robot/{id}")
	public APIResponse getOne(@PathVariable int id) {
		return this.successResponse(this.robotService.findOneAsDTO(id));
	}

	@GetMapping("/robot/category/{id}")
	public APIResponse findByCategoryId(@PathVariable int id) {
		return this.successResponse(this.robotService.findByCategory(id));
	}
	
	@DeleteMapping("/robot/{id}")
	public APIResponse deleteRobot(@PathVariable int id) {
		this.robotService.delete(id);
		return this.successResponse(null);
	}
}