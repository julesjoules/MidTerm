package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	ArrayList<Course> CourseList = new ArrayList<Course>();
	ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	ArrayList<Section> SectionList = new ArrayList<Section>();
	ArrayList<Student> StudentList = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test() {
		CourseList.add(new Course(UUID.randomUUID(), "CISC108", 3, eMajor.COMPSI)));
		CourseList.add(new Course(UUID.randomUUID(), "what", 3, eMajor.CHEM));
		CourseList.add(new Course(UUID.randomUUID(), "CISC220", 3, eMajor.COMPSI));
		SemesterList.add(new Semester(UUID.randomUUID(), new Date(2017, 8, 27), new Date(2017, 12, 27)));
		SemesterList.add(new Semester(UUID.randomUUID(), new Date(2018, 1, 27), new Date(2018, 5, 27)));
		SectionList.add(new Section(CourseList.get(0).getCourseID(), SemesterList.get(0).getSemsterID(), UUID.randomUUID(), 2));
		SectionList.add(new Section(CourseList.get(0).getCourseID(), SemesterList.get(1).getSemsterID(), UUID.randomUUID(), 2));
		SectionList.add(new Section(CourseList.get(1).getCourseID(), SemesterList.get(0).getSemsterID(), UUID.randomUUID(), 2));
		SectionList.add(new Section(CourseList.get(1).getCourseID(), SemesterList.get(1).getSemsterID(), UUID.randomUUID(), 2));
		SectionList.add(new Section(CourseList.get(2).getCourseID(), SemesterList.get(0).getSemsterID(), UUID.randomUUID(), 2));
		SectionList.add(new Section(CourseList.get(2).getCourseID(), SemesterList.get(1).getSemsterID(), UUID.randomUUID(), 2));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		StudentList.add(new Student("FirstName", "MiddleName", "LastName", new Date(2017, 8, 27), eMajor.CHEM,
				"Address", "(123)-345-1234", "a@udel.edu"));
		
		assertTrue(1 == 1);
	}
}