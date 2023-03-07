package com.org.future.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.future.Entity.FutureIndia;

@Service
public interface Java8LogicalService {

	FutureIndia getAllMaxSalaryValue(FutureIndia futureIndia);

	FutureIndia getAllMinSalaryValue(FutureIndia futureIndia);

	double getAllSumSalaryValue(FutureIndia futureIndia);

	double getAllCountSalaryValue(FutureIndia futureIndia);

	List<FutureIndia> findAllDetails();

}
