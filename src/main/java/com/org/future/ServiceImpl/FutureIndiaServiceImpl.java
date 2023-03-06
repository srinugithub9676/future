package com.org.future.ServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.future.Entity.FutureIndia;
import com.org.future.Exeception.EmptyInputException;
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
		if (futureIndia.getJobName().isEmpty() || futureIndia.getJobName().length() == 0) {
			throw new EmptyInputException("600", "input is filed empty");
		}

		return futureIndiaRepository.save(futureIndia);
	}

	@Override
	public List<FutureIndia> findAllFutureDetails() {
		// TODO Auto-generated method stub
		List<FutureIndia> list = futureIndiaRepository.findAll();
		if (list.isEmpty()) {
			throw new EmptyInputException("600", "input is filed empty");
		}
		System.out.println(list);
		return list;
	}

	@Override
	public FutureIndia findAllFutureDetailsById(int jobId) {
		return futureIndiaRepository.findById(jobId).get();

	}

	@Override
	public List<FutureIndia> findAllFutureDetailsByName(String jobType) {
		List<FutureIndia> future = futureIndiaRepository.findByJobType(jobType);
		if(future.isEmpty())
		{
			throw new PleaseEnterCorrectNameException();	
		}
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
