package com.org.future.ServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.future.Entity.FutureIndia;
import com.org.future.Exeception.PleaseEnterCorrectNameException;
import com.org.future.Repositories.FutureIndiaRepository;
import com.org.future.Service.FutureIndiaService;

@Component
public class FutureIndiaServiceImpl implements FutureIndiaService {

	@Autowired
	private FutureIndiaRepository futureIndiaRepository;

	@Override
	public FutureIndia saveFutureDetails(FutureIndia futureIndia) {
		// TODO Auto-generated method stub
		return futureIndiaRepository.save(futureIndia);
	}

	@Override
	public List<FutureIndia> findAllFutureDetails() {
		// TODO Auto-generated method stub
		List<FutureIndia> list = futureIndiaRepository.findAll();
		System.out.println(list);
		return list;
	}

	@Override
	public FutureIndia findAllFutureDetailsById(int jobId) {
		FutureIndia future = futureIndiaRepository.findByJobId(jobId);
		System.out.println(future);
		return future;
	}

	@Override
	public List<FutureIndia> findAllFutureDetailsByName(String jobType) {
		
		 if(jobType.isEmpty()||jobType.length()==0) { throw new
		  PleaseEnterCorrectNameException(); }
		 
		List<FutureIndia> future = futureIndiaRepository.findByJobType(jobType);
		/*
		 * if(jobType.equals(future)) throw new PleaseEnterCorrectNameException();
		 * 
		 * else
		 */
		return future;
	
	}
	@Override
	public FutureIndia updateFutureDetails(FutureIndia futureIndia) {
		return futureIndiaRepository.save(futureIndia);
	}

	@Override
	public void deleteUpdateDetails(FutureIndia futureIndia) {
		// TODO Auto-generated method stub
		futureIndiaRepository.delete(futureIndia);
	}

	

}
