package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		SemesterID = SemesterID;
		StartDate = StartDate;
		EndDate = EndDate;
		
	}
	
	public UUID getSemsterID() {
		return SemesterID;
		
	}
	
	public Date getStartDate() {
		return StartDate;
		
	}
	
	public Date getEndDate() {
		return EndDate;
		
	}
}
