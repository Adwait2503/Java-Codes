package com.te.spring.springannotationxml;

import org.springframework.beans.factory.annotation.Value;

public class MockRatings {
	@Value("Good")
	String ratings;
	@Value("85")
	int theory;
	int practical;

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

	public void setTheory(int theory) {
		this.theory = theory;
	}

	public void setPractical(int practical) {
		this.practical = practical;
	}

	@Override
	public String toString() {
		return "MockRatings [ratings=" + ratings + ", theory=" + theory + ", practical=" + practical + "]";
	}

}
