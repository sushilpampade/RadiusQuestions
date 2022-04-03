package com.example.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestA {

	@Autowired
	private TestB b;

	public TestB getB() {
		return b;
	}

	public void setB(TestB b) {
		this.b = b;
	}

}
