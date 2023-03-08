package com.org.future.ServiceImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.future.Entity.FutureIndia;
import com.org.future.Repositories.Java8LogicalRepository;
import com.org.future.Service.Java8LogicalService;


@Component
public class Java8LogicalServiceImpl implements Java8LogicalService {

	@Autowired
	private Java8LogicalRepository java8LogicalRepository;

	@Override
	public FutureIndia getAllMaxSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list = java8LogicalRepository.findAll();
		FutureIndia maxValue = list.stream()
				.max((s1, s2) -> s1.getSalary() < s2.getSalary() ? -1 : s1.getSalary() > s2.getSalary() ? 1 : 0).get();
		return maxValue;
	}

	@Override
	public FutureIndia getAllMinSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list = java8LogicalRepository.findAll();
		FutureIndia minValue = list.stream()
				.min((s1, s2) -> s1.getSalary() < s2.getSalary() ? -1 : s1.getSalary() > s2.getSalary() ? 1 : 0).get();
		return minValue;
	}

	@Override
	public double getAllSumSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list = java8LogicalRepository.findAll();
		double salary = list.stream().mapToDouble((s1) -> s1.getSalary()).summaryStatistics().getSum();
		return salary;
	}

	@Override
	public double getAllCountSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list = java8LogicalRepository.findAll();
		double salary = list.stream().mapToDouble((s1) -> s1.getSalary()).summaryStatistics().getCount();
		return salary;
	}

	@Override
	public List<FutureIndia> findAllDetails() {
		// TODO Auto-generated method stub
		return java8LogicalRepository.findAll();
	}

	@Override
	public Map<Integer, FutureIndia> findAllConversionDeatils() {
		List<FutureIndia> list = java8LogicalRepository.findAll();
		Map<Integer, FutureIndia> listToMap = list.stream()
				.collect(Collectors.toMap(FutureIndia::getJobId, Function.identity()));
		return listToMap;
	}

	@Override
	public Set<FutureIndia> printDublicateRecords() {
		Set<Double> set = new HashSet<Double>();
		List<FutureIndia> list = java8LogicalRepository.findAll();
		Set<FutureIndia> dublicates = list.stream().filter(s1 -> !set.add(s1.getSalary())).collect(Collectors.toSet());

		return dublicates;
	}

	@Override
	public Set<Double> withoutDublicateRecords() {
		Set<Double> set = new HashSet<Double>();
		List<FutureIndia> list = java8LogicalRepository.findAll();
		Set<FutureIndia> dublicates = list.stream().filter(s1 -> !set.add(s1.getSalary())).collect(Collectors.toSet());
		System.out.println(dublicates);
		return set;
	}

	@Override
	public Map<Character, Integer> stringOccurence() {
		String str = null;
		List<FutureIndia> list = java8LogicalRepository.findAll();
		List<String> names = list.stream().map(s1 -> s1.getJobName()).collect(Collectors.toList());
		for (String string : names) {
			if (string.equals("Engneer3")) {
				str="Engneer3";
				break;
			}

		}

		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character char1 : ch) {
			if (map.containsKey(char1)) {
				map.put(char1, map.get(char1) + 1);

			} else {
				map.put(char1, +1);
			}
		}
		System.out.println(map);
		return map;
	}

	@Override
	public List<FutureIndia> evenJobIdDetails() {
		List<FutureIndia> jobsids= java8LogicalRepository.findAll();
	List<FutureIndia>even=jobsids.stream().filter(s1->s1.getJobId()%2==0).collect(Collectors.toList());
		return even;
	}

	@Override
	public List<FutureIndia> oddJobIdDetails() {
		List<FutureIndia> jobsids= java8LogicalRepository.findAll();
		List<FutureIndia>odd=jobsids.stream().filter(s1->s1.getJobId()%2!=0).collect(Collectors.toList());
			return odd;
	}

	@Override
	public Map<Integer, Set<FutureIndia>> groupingExampleDetails() {
		List<FutureIndia> list= java8LogicalRepository.findAll();
		//Map<Integer,List<FutureIndia>> group=list.stream().collect(Collectors.groupingBy(s1->s1.getAgeLimit()));
		Map<Integer,Set<FutureIndia>> group=list.stream().collect(Collectors.groupingBy(emp->emp.getAgeLimit(),TreeMap::new,Collectors.toSet()));
		return group;
	}

	@Override
	public List<FutureIndia> particularRecordsDetails() {
		List<FutureIndia> list= java8LogicalRepository.findAll();
		List<FutureIndia>paticularRecords =list.stream().skip(1).limit(4).collect(Collectors.toList());
		return paticularRecords;
	}

	@Override
	public List<FutureIndia> sortparticularRecordsDetails() {
		List<FutureIndia> list= java8LogicalRepository.findAll();
		List<FutureIndia> sort1 = list.stream()
				.sorted((s1, s2) -> s1.getJobId() < s2.getJobId() ? -1 : s1.getJobId() > s2.getJobId() ? 1 : 0).skip(2).limit(6)
				.collect(Collectors.toList());
		//System.out.println(sort1);
		return sort1;
	}

}
