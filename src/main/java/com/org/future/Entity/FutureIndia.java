package com.org.future.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FutureIndia {
	@Id
	@GeneratedValue
	private int jobId;
	private String jobName;
	private int ageLimit;
	private double salary;
	private String jobType;

}
