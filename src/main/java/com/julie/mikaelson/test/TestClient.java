package com.julie.mikaelson.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.julie.mikaelson.test.model.Person;
import com.julie.mikaelson.test.repository.PersonRepository;


@Controller
public class TestClient {

	@Autowired
	private PersonRepository repository;

	
	@RequestMapping({"/","/home"})
	@ResponseBody
	public String toHome() {
		return "home";
	}
	
	@RequestMapping("/testConn")
	@ResponseBody
	public String doSomething() {
		
		repository.save(new Person("niklaus mikaelson","Matthews","Matthews"));
		
		List<Person> persons = repository.findByLastname("Matthews");
		for(Person s :persons) {
			System.out.println(s);
		}
		return "home";
		
	}

}
