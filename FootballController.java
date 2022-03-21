package com.qa.football.rest;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.football.domain.Football;
import com.qa.football.service.FootballServiceDB;
import com.qa.football.service.FootballServiceList;

@RestController
public class FootballController {
	
	private FootballServiceDB service;
	
	public FootballController(FootballServiceDB service) {
		super();
		this.service = service;
	}

	//Create a record
	@PostMapping("/create")
	public ResponseEntity<Football> addFootballer(@RequestBody Football ballers) {
		return new ResponseEntity<Football>(this.service.create(ballers), HttpStatus.CREATED);
	}
	
	//Return all footballers in the list
	@GetMapping("/read") 
	public ResponseEntity<Football> getBaller() {
		return new ResponseEntity<Football>((Football) this.service.read(), HttpStatus.ACCEPTED);
	}
	
	//Return only the ID selected
	@GetMapping("/read/{id}")
	public ResponseEntity<Football> getId(@PathVariable Integer id) {
		return new ResponseEntity<Football>(this.service.returnOne(id),HttpStatus.FOUND);
	}
	
	//Update a field
	@PutMapping("/update/{id}")
	public ResponseEntity<Football> updateFootball(@PathVariable Integer id, @RequestBody Football updated) {
		return new ResponseEntity<Football>(this.service.update(id, updated), HttpStatus.CONTINUE);	
	}
	
	//Delete a selected ID
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Football> delete(@PathParam("id") Integer id) {
		return new ResponseEntity<Football>(this.service.delete(id), HttpStatus.CONTINUE);
	}
}
