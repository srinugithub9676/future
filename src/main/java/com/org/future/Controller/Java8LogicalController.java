package com.org.future.Controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.future.Entity.FutureIndia;
import com.org.future.Service.Java8LogicalService;

@RestController
@RequestMapping("/java8")
public class Java8LogicalController {

	@Autowired
	private Java8LogicalService java8LogicalService;

	@GetMapping("findAll")
	public List<FutureIndia> findAllFutureIndia() {
		List<FutureIndia> list = java8LogicalService.findAllDetails();
		return list;
	}

	@GetMapping("/maxSalary")
	public FutureIndia getMaxSalary(FutureIndia futureIndia) {
		FutureIndia maxandmin = java8LogicalService.getAllMaxSalaryValue(futureIndia);
		return maxandmin;
	}

	@GetMapping("/minSalary")
	public FutureIndia getMinSalary(FutureIndia futureIndia) {
		FutureIndia maxandmin = java8LogicalService.getAllMinSalaryValue(futureIndia);
		return maxandmin;
	}

	@GetMapping("/sumSalary")
	public double getSumSalary(FutureIndia futureIndia) {
		double maxandmin = java8LogicalService.getAllSumSalaryValue(futureIndia);
		return maxandmin;
	}

	@GetMapping("/countSalary")
	public double getCountSalary(FutureIndia futureIndia) {
		double maxandmin = java8LogicalService.getAllCountSalaryValue(futureIndia);
		return maxandmin;
	}

	@GetMapping("conversionToMap")
	public Map<Integer, FutureIndia> findListToMapConVersion() {
		Map<Integer, FutureIndia> list = java8LogicalService.findAllConversionDeatils();
		return list;
	}

	@GetMapping("/onlyDublicates")
	public Set<FutureIndia> printDublicates() {
		Set<FutureIndia> dublictes = java8LogicalService.printDublicateRecords();
		return dublictes;
	}

	@GetMapping("/withoutDublicates")
	public Set<Double> withoutDublicates() {
		Set<Double> dublictes = java8LogicalService.withoutDublicateRecords();
		return dublictes;
	}

	@GetMapping("/StringOccurence")
	public Map<Character, Integer> stringOcuurence() {
		Map<Character, Integer> occur = java8LogicalService.stringOccurence();
		return occur;
	}
	
	@GetMapping("/even")
	public List<FutureIndia> evenJobIds() {
		List<FutureIndia>	 occur = java8LogicalService.evenJobIdDetails();
		return occur;
	}
	@GetMapping("/odd")
	public List<FutureIndia> oddJobIds() {
		List<FutureIndia>	 occur = java8LogicalService.oddJobIdDetails();
		return occur;
	}
	@GetMapping("/grouping")
	public Map<Integer, Set<FutureIndia>> groupingExample() {
		Map<Integer, Set<FutureIndia>>	 occur = java8LogicalService.groupingExampleDetails();
		return occur;
	}
	@GetMapping("/particularrecords")
	public List<FutureIndia> particularRecordsExample() {
		List<FutureIndia>	 occur = java8LogicalService.particularRecordsDetails();
		return occur;
	}
	@GetMapping("/sortparticularrecords")
	public List<FutureIndia> sortparticularRecordsExample() {
		List<FutureIndia>	 occur = java8LogicalService.sortparticularRecordsDetails();
		return occur;
	}
	
}
