package lu.innoviction.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lu.innoviction.domain.Photo;
import lu.innoviction.domain.Robot;
import lu.innoviction.service.RobotService;


@RestController
public class RobotController {
	
	@Autowired
	private RobotService robotService;
	
	/**
	 * Lists the photo stored in the database.
	 * @return List<Photo>
	 */
	@GetMapping("/photo")
	public List<Photo> listPhoto() {
		return this.robotService.listPhotos();
	}	
	
	/**
	 * Lists the robots stored in the database.
	 * @return List<Robot>
	 */
	@GetMapping("/robot")
	public List<Robot> list() {
		return this.robotService.list();
	}	
	
	/***
	 * Used to store a new robot entry in the database.
	 * @param robot
	 */
	@PostMapping("/robot")
	public void add(@RequestBody Robot robot) {
		this.robotService.add(robot);
	}

	@GetMapping("/robot/{id}")
	public Robot getOne(@PathVariable int id) {
		return this.robotService.get(id);
	}

	@DeleteMapping("/robot/{id}")
	public void deleteRobot(@PathVariable int id) {
		this.robotService.delete(id);
	}
	
	
}
