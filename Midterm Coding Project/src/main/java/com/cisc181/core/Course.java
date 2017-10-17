package com.cisc181.core;

import com.cisc181.eNums.*;
import java.util.UUID;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(UUID CourseID, String CourseName, int Gradepoints, eMajor Major) {
		CourseID = CourseID;
		CourseName = CourseName;
		GradePoints = GradePoints;
		Major = Major;
	}
	
	public UUID getCourseID() {
		return CourseID;
		
	}
	
	public String getCourseName() {
		return CourseName;
		
	}
	
	public int getGradePoints() {
		return GradePoints;
		
	}
	
	public eMajor getMajor() {
		return Major;
		
	}

}
