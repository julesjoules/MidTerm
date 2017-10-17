package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import cisc.PkgExceptions.*;
import pkgException.DeckException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	ArrayList<Staff> StaffList = new ArrayList<Staff>();
	

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test()  throws PersonException {
		StaffList.add(new Staff("A", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "(123)-345-1234",
			"a@a.or", "MTW from 3-4", 1, 20.50, new Date(2011, 8, 8), eTitle.MR));
		StaffList.add(new Staff("A", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "(123)-345-1234",
				"a@a.or", "MTW from 3-4", 1, 30.50, new Date(2011, 8, 8), eTitle.MR));
		StaffList.add(new Staff("A", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "(123)-345-1234",
				"a@a.or", "MTW from 3-4", 1, 25.50, new Date(2011, 8, 8), eTitle.MR));
		StaffList.add(new Staff("A", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "(123)-345-1234",
				"a@a.or", "MTW from 3-4", 1, 50.50, new Date(2011, 8, 8), eTitle.MR));
		StaffList.add(new Staff("A", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "(123)-345-1234",
				"a@a.or", "MTW from 3-4", 1, 28.50, new Date(2011, 8, 8), eTitle.MR));
		
		double sum = 0;
		for (Staff s : StaffList) {
			sum += s.getSalary();
		}
		double sumt = sum / 5;
		assertTrue(31.1 == sumt);
		
	}
	
	@Test (expected = PersonException.class)
	public void secondTest()  throws PersonException {
		StaffList.add(new Staff("B", "B", "C", new Date(999, 5, 1), "12 ave, neward de", "(123)-345-1234",
				"a@a.or", "MTW from 3-4", 1, 20.50, new Date(2011, 8, 8), eTitle.MR));

	}
	@Test (expected = PersonException.class)
	public void thirdTest()  throws PersonException {
		StaffList.add(new Staff("B", "B", "C", new Date(2012, 5, 1), "12 ave, neward de", "133451234",
				"a@a.or", "MTW from 3-4", 1, 20.50, new Date(2011, 8, 8), eTitle.MR));

	}
	
}
