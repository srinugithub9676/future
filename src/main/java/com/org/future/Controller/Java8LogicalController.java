package com.org.future.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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
	
	@GetMapping("conversionToMap")
	public Map<Integer, FutureIndia> findListToMapConVersion(){
	Map<Integer, FutureIndia> list=java8LogicalService.findAllConversionDeatils();
	return list;
	/*
	 * List<Employee> list = new ArrayList<Employee>(); list.add(new Employee(103,
	 * "suresh", 15000, "PA")); list.add(new Employee(101, "rajee", 85000,
	 * "PADESC")); list.add(new Employee(104, "ajay", -95000, "SENIORSW"));
	 * list.add(new Employee(107, "yyr", 70000, "MANAGER")); list.add(new
	 * Employee(105, "srinu", 30000, "TL")); System.out.println(list); //
	 * =============================================================================
	 * =========================== Set<Employee> set = new HashSet<Employee>();
	 * set.add(new Employee(101, "srinu", 25000, "PA")); set.add(new Employee(100,
	 * "Naresh", 15000, "ASSCOATE")); set.add(new Employee(108, "suresh", 45000,
	 * "SENIORASSCIATE")); set.add(new Employee(107, "ajay", 80000, "MANAGER"));
	 * System.out.println(set);
	 * System.out.println("=======================================================")
	 * ; //
	 * =============================================================================
	 * ============================ Map<Integer, Employee> map = new
	 * HashMap<Integer, Employee>(); map.put(1, new Employee(100, "kumar", 75000,
	 * "TL")); map.put(2, new Employee(101, "prakash", 35000, "MANAGER"));
	 * map.put(3, new Employee(102, "ponni", 95000, "SR MANAGER")); map.put(4, new
	 * Employee(103, "sreeni", 84000, "ASSCIATE")); System.out.println(
	 * "==========================================================="); //
	 * =============================================================================
	 * =============================== Set<Employee>
	 * listToSetConversion=list.stream().collect(Collectors.toSet());
	 * System.out.println("list To Set Conversion"+listToSetConversion);
	 * System.out.println(
	 * "==============================================================================================="
	 * );
	 * //===========================================================================
	 * ===================================== List<Employee>
	 * setToListConversion=set.stream().collect(Collectors.toList());
	 * System.out.println("set To list Conversion"+listToSetConversion);
	 * System.out.println(
	 * "==============================================================================================="
	 * );
	 * //===========================================================================
	 * ===================================== Map<Integer, Employee>
	 * listToMapConveraion =
	 * list.stream().collect(Collectors.toMap(Employee::getEmpId,
	 * Function.identity())); System.out.println("List to map conversion" +
	 * listToMapConveraion); System.out.println(
	 * "==============================================================================================="
	 * );
	 * //===========================================================================
	 * =====================================
	 * 
	 * List<Object> mapToListConversion =
	 * map.entrySet().stream().collect(Collectors.toList());
	 * System.out.println("map to list conversion" + mapToListConversion);
	 * System.out.println(
	 * "==============================================================================================="
	 * ); Set<Object> mapToSetConversion =
	 * map.entrySet().stream().collect(Collectors.toSet());
	 * System.out.println("map to set conversion" + mapToSetConversion);
	 * System.out.println(
	 * "==============================================================================================="
	 * ); Map<Integer,Object>
	 * setToMapConversion=set.stream().collect(Collectors.toMap(Employee::getEmpId,
	 * Function.identity()));
	 * System.out.println("set to map convirsion"+setToMapConversion);
	 */
	
	
	}

}
