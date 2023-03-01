package com.org.future.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.future.Entity.FutureIndia;

@Service
public interface FutureIndiaService {

	FutureIndia saveFutureDetails(FutureIndia futureIndia);

	List<FutureIndia> findAllFutureDetails();
	
	FutureIndia findAllFutureDetailsById(int jobId);


	List<FutureIndia> findAllFutureDetailsByName(String jobType);

	FutureIndia updateFutureDetails(FutureIndia futureIndia);

	void deleteUpdateDetails(FutureIndia futureIndia);

	
}
