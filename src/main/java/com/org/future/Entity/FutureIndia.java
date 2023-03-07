package com.org.future.Entity;


import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FutureIndia {
	@Id
	private int jobId;
	private String jobName;
	private int ageLimit;
	private double salary;
	private String jobType;
	
    @OneToMany(targetEntity = Company.class,cascade = CascadeType.ALL)
	@JoinColumn(name="future_company_fk",referencedColumnName = "jobId")
	private List<Company>compinies;

}
