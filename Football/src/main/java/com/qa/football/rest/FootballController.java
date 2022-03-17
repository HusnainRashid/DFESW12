package com.qa.football.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.football.domain.Football;

@RestController
public class FootballController {
	private ArrayList<Football> footballers = new ArrayList<>();
	
	//Create a record
	@PostMapping("/create")
	public void addFootballer(@RequestBody Football ballers) {
		this.footballers.add(ballers);
	}
	
	//Return all footballers in the list
	@GetMapping("/read") 
	public List<Football> getBaller() {
		return this.footballers;
	}
	
	//Return only the ID selected
	@GetMapping("/read/{id}")
	public Football getId(int id) {
		return this.footballers.get(id);
	}
	
	//Delete a selected ID
	@DeleteMapping("/read/{id}")
	public void deleteId(int id) {
		this.footballers.remove(id)
	}
}
