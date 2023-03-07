package com.org.future.ServiceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		List<FutureIndia> list=java8LogicalRepository.findAll();
		FutureIndia maxValue=list.stream().max((s1,s2)->s1.getSalary()<s2.getSalary()?-1:s1.getSalary()>s2.getSalary()?1:0).get();
		return maxValue;
	}

	@Override
	public FutureIndia getAllMinSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list=java8LogicalRepository.findAll();
	FutureIndia minValue=	list.stream().min((s1,s2)->s1.getSalary()<s2.getSalary()?-1:s1.getSalary()>s2.getSalary()?1:0).get();
		return minValue;
	}

	@Override
	public double getAllSumSalaryValue(FutureIndia futureIndia) {
	List<FutureIndia> list=java8LogicalRepository.findAll();
	double salary=list.stream().mapToDouble((s1)->s1.getSalary()).summaryStatistics().getSum();
		return salary;
	}

	@Override
	public double getAllCountSalaryValue(FutureIndia futureIndia) {
		List<FutureIndia> list=java8LogicalRepository.findAll();
		double salary=list.stream().mapToDouble((s1)->s1.getSalary()).summaryStatistics().getCount();
			return salary;
	}

	@Override
	public List<FutureIndia> findAllDetails() {
		// TODO Auto-generated method stub
		return java8LogicalRepository.findAll();
	}

	@Override
	public Map<Integer, FutureIndia> findAllConversionDeatils() {
	List<FutureIndia> list=java8LogicalRepository.findAll();
	Map<Integer,FutureIndia> listToMap=list.stream().collect(Collectors.toMap(FutureIndia::getJobId, Function.identity()));
		return listToMap;
	}

	@Override
	public Set<FutureIndia> printDublicateRecords() {
		Set<Double> set=new HashSet<Double>();
		List<FutureIndia> list=java8LogicalRepository.findAll();
		Set<FutureIndia> dublicates=list.stream().filter(s1->!set.add(s1.getSalary())).collect(Collectors.toSet());
			
		return dublicates;
	}

	@Override
	public Set<Double> withoutDublicateRecords() {
		Set<Double> set=new HashSet<Double>();
		List<FutureIndia> list=java8LogicalRepository.findAll();
		Set<FutureIndia> dublicates=list.stream().filter(s1->!set.add(s1.getSalary())).collect(Collectors.toSet());
			System.out.println(dublicates);
		return set;
	}
}
