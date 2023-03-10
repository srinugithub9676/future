package com.org.future.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.future.Entity.FutureIndia;
import com.org.future.Service.FutureIndiaService;

@RestController
@RequestMapping("/future")
public class FutureIndiaController {

	@Autowired
	private FutureIndiaService futureIndiaService;

	@GetMapping("/test")
	public String test() {
		return "WELCOME TO SPRINGBOOT APPLICATION IT'S MY FIRST TIME WORKING ON JENKINS11 And Also Added from eclipse to firsttime ";
		
	}
	
	@PostMapping("/savefuture")
	public ResponseEntity<FutureIndia> saveFuture(@RequestBody FutureIndia futureIndia) {
		FutureIndia future = futureIndiaService.saveFutureDetails(futureIndia);
		return new ResponseEntity<FutureIndia>(future, HttpStatus.CREATED);

	}

	@PutMapping("/updateFuture")
	public ResponseEntity<FutureIndia> updateFuture(@RequestBody FutureIndia futureIndia) {
		FutureIndia future = futureIndiaService.updateFutureDetails(futureIndia);
		return new ResponseEntity<>(future, HttpStatus.CREATED);

	}
	
	@DeleteMapping("/deleteFuture")
	public ResponseEntity<Void> deleteFuture(@RequestBody FutureIndia futureIndia) {
        futureIndiaService.deleteUpdateDetails(futureIndia);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
		}

	@GetMapping(value= "/findAlldetails")
	public ResponseEntity<List<FutureIndia>> findAllFuture() {
		List<FutureIndia> listfuture = futureIndiaService.findAllFutureDetails();
		return new ResponseEntity<List<FutureIndia>>(listfuture, HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<FutureIndia> findByIdFuture(@PathVariable("id") int jobId) {
		FutureIndia listfuture = futureIndiaService.findAllFutureDetailsById(jobId);
		return new ResponseEntity<FutureIndia>(listfuture, HttpStatus.OK);
	}

	@GetMapping("/findByName/{jobType}")
	public List<FutureIndia> findByNameFuture(@PathVariable("jobType") String jobType) {
		List<FutureIndia> listfuture = futureIndiaService.findAllFutureDetailsByName(jobType);
		return listfuture ;

	}

}
