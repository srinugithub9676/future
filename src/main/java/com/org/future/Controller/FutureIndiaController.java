package com.org.future.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.future.Entity.FutureIndia;
import com.org.future.Service.FutureIndiaService;

@RestController
@RequestMapping("/future")
public class FutureIndiaController {
	
	@Autowired
	private FutureIndiaService  futureIndiaService;
	
	@PostMapping("/savefuture")
	public ResponseEntity<FutureIndia> saveFuture(@RequestBody FutureIndia futureIndia){
		FutureIndia future=	futureIndiaService.saveFutureDetails(futureIndia);
		return new ResponseEntity<>(future,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/findAlldetails")
	public ResponseEntity<FutureIndia> findAllFuture() {
	List<FutureIndia> listfuture=futureIndiaService.findAllFutureDetails();
	return new ResponseEntity(listfuture,HttpStatus.OK);
	}
	
	

}
