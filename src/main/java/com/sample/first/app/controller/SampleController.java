package com.sample.first.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.first.app.service.SampleServiceImpl;

@RestController
public class SampleController {
	@Autowired
	SampleServiceImpl sampleServiceImpl; 
	
	
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return sampleServiceImpl.test();
	}

}
