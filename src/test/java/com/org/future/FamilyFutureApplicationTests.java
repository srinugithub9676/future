package com.org.future;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.org.future.Entity.FutureIndia;
import com.org.future.Repositories.FutureIndiaRepository;
import com.org.future.Service.FutureIndiaService;

@SpringBootTest
class FamilyFutureApplicationTests {
	
	@Autowired
	private FutureIndiaService futureIndiaService;
	
	@MockBean
	private FutureIndiaRepository futureIndiaRepository;
	
	@Test
	public void findAllFutureTest() {
		when(futureIndiaRepository.findAll()).thenReturn(Stream
				.of(new FutureIndia(100,"Danile", 35,55500, "Govt"), new FutureIndia(100,"Danile", 35,55500, "Govt"), new FutureIndia(100,"Danile", 35,55500, "Govt")).collect(Collectors.toList()));
		assertEquals(3, futureIndiaService.findAllFutureDetails().size());
	}
		
	@Test
	public void findByNameFutureTest() {
		String jobType = "Govt";
		when(futureIndiaRepository.findByJobType(jobType))
				.thenReturn(Stream.of(new FutureIndia(100,"Danile", 35,55500, "Govt")).collect(Collectors.toList()));
		assertEquals(1, futureIndiaService.findAllFutureDetailsByName(jobType).size());
	}
	
	@Test
	public void findByIdFutureTest() {
		when(futureIndiaRepository.findByJobId(1))
				.thenReturn(new FutureIndia(100,"Mro", 35,5000.0, "Govt"));
		FutureIndia emp=futureIndiaService.findAllFutureDetailsById(1);
		
		assertEquals("Mro", emp.getJobName());
		assertEquals(35, emp.getAgeLimit());
		assertEquals("Govt", emp.getJobType());
		assertEquals(5000.0, emp.getSalary());
	}
	
	@Test
	public void updateFutureTest() {
		FutureIndia future = new FutureIndia(100,"Danile", 35,55500, "Govt");
		when(futureIndiaRepository.save(future)).thenReturn(future);
		assertEquals(future, futureIndiaService.updateFutureDetails(future));
	}
	
	@Test
	public void saveFutureTest() {
		FutureIndia future = new FutureIndia(100,"Danile", 35,55500, "Govt");
		when(futureIndiaRepository.save(future)).thenReturn(future);
		assertEquals(future, futureIndiaService.saveFutureDetails(future));
	}

	@Test
	public void deleteFutureTest() {
		FutureIndia user = new FutureIndia(100,"Danile", 35,55500, "Govt");
		futureIndiaService.deleteUpdateDetails(user);
		verify(futureIndiaRepository, times(1)).delete(user);
	}

}
