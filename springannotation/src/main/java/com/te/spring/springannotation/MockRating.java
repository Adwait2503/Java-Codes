package com.te.spring.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MockRating {
	@Value("Good")
	String rating;
	@Value("80")
	int theory;
	@Value("83")
	int practicals;

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setTheory(int theory) {
		this.theory = theory;
	}

	public void setPracticals(int practicals) {
		this.practicals = practicals;
	}

	@Override
	public String toString() {
		return "MockRating [rating=" + rating + ", theory=" + theory + ", practicals=" + practicals + "]";
	}

}
