package com.te.spring.springannotationxml;

import org.springframework.beans.factory.annotation.Autowired;

public class Salary {
	@Autowired
	MockRatings mockRatings;

	@Override
	public String toString() {
		return "Salary [mockRatings=" + mockRatings + "]";
	}

}
