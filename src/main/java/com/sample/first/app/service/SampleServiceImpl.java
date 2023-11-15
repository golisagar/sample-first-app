package com.sample.first.app.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public String test() {
		
		return "Hello";
	}

}
