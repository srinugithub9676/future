package com.org.future.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.future.Entity.FutureIndia;

@Repository
public interface FutureIndiaRepository extends JpaRepository<FutureIndia, Integer>{

}
