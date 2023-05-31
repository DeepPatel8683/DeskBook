package com.onerivet.models.payload;


import com.onerivet.models.entity.WorkingDay;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeWorkingDaysDto {
	
	private int id;

	//@JsonIgnore
	//private Employee employee;

	private WorkingDay day;

	//@JsonIgnore
	//private Employee createdBy;
}
