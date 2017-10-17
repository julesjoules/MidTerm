package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	public Section(UUID CourseID, UUID SemsterID, UUID SEctionID, int RoomID) {
		CourseID = CourseID;
		SemesterID = SemesterID;
		SectionID = SectionID;
		RoomID = RoomID;
		
	}
	
	public UUID getCourseID() {
		return CourseID;
		
	}
	
	public UUID getSemesterID() {
		return SemesterID;
		
	}
	
	public UUID getSectionID() {
		return SectionID;
		
	}
	
	public int getRoomID() {
		return RoomID;
		
	}

}
