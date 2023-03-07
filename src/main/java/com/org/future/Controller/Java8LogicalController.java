package com.org.future.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.future.Entity.FutureIndia;
import com.org.future.Service.FutureIndiaService;
import com.org.future.Service.Java8LogicalService;

@RestController
@RequestMapping("/java8")
public class Java8LogicalController {
	
	@Autowired
	private Java8LogicalService java8LogicalService;
	
	@GetMapping("findAll")
	public List<FutureIndia> findAllFutureIndia(){
	List<FutureIndia> list=java8LogicalService.findAllDetails();
	return list;
	}
	
	@GetMapping("/maxSalary")
	public FutureIndia getMaxSalary(FutureIndia futureIndia){
		FutureIndia maxandmin=	java8LogicalService.getAllMaxSalaryValue(futureIndia);
		return maxandmin;
	}
	@GetMapping("/minSalary")
	public FutureIndia getMinSalary(FutureIndia futureIndia){
		FutureIndia maxandmin=	java8LogicalService.getAllMinSalaryValue(futureIndia);
		return maxandmin;
	}
	@GetMapping("/sumSalary")
	public double getSumSalary(FutureIndia futureIndia){
		double maxandmin=	java8LogicalService.getAllSumSalaryValue(futureIndia);
		return maxandmin;
	}
	@GetMapping("/countSalary")
	public double getCountSalary(FutureIndia futureIndia){
		double maxandmin=	java8LogicalService.getAllCountSalaryValue(futureIndia);
		return maxandmin;
	}

}
