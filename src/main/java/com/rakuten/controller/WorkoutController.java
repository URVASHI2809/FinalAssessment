package com.rakuten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Workout;
import com.rakuten.services.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

	@Autowired
	WorkoutService service;

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleNotFound() 
	{
//		
	}
	
	@PostMapping
	void postWorkout(@RequestBody Workout workout) {
		System.out.println(workout.getTitle());
		service.saveWorkout(workout);
	}

	@GetMapping
	List<Workout> getWorkouts() {
		return service.getAllWorkouts();
	}

	@GetMapping("/id")
	Workout getWorkoutById(@RequestParam int id) {
		System.out.println(id);
		return service.getWorkoutById(id);
	}

	@PutMapping("/updated")
	void updateWorkout(@RequestBody Workout workout) {
		service.updateWorkoutById(workout);
	}
	
	@DeleteMapping("/deleted")
	void deleteWorkout(@RequestParam int id) {
		service.deleteWorkoutById(id);
	}

}