package com.org.future.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.future.Entity.FutureIndia;

@Repository
public interface Java8LogicalRepository extends JpaRepository<FutureIndia, Integer>{

	String findByJobName(String jobName);

}
