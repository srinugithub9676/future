package com.org.future.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
