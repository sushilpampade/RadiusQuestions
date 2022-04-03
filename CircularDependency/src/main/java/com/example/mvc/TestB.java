package com.example.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class TestB {
	
	@Autowired
	private TestA a;

	public TestA getA() {
		return a;
	}

	public void setA(TestA a) {
		this.a = a;
	}

	
}
