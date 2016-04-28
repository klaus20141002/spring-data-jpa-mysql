package com.julie.mikaelson.test;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.julie.mikaelson.test.model.Address;
import com.julie.mikaelson.test.model.Person;
import com.julie.mikaelson.test.repository.AddressRepository;
import com.julie.mikaelson.test.repository.PersonRepository;


@Controller
public class TestClient {

	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private AddressRepository addressRepository ;
	
	@RequestMapping({"/","/home"})
	@ResponseBody
	public String toHome() {
		return "home";
	}
	
	@RequestMapping("/testConn")
	@ResponseBody
	public String doSomething() {
		Address addressCompany =new Address() ;
		addressCompany.setCityId(1);
		addressCompany.setDistrictId(1);
		addressCompany.setProvenceId(1);
		addressCompany.setFullAddress("guangdong provence , shenzheng city ,nanshang district,science yarm sabirn buildingo");
		
		Person person = new Person("niklaus mikaelson","Matthews","Matthews",new Date()) ;
		person.setCompanyAddress(addressRepository.save(addressCompany).getId());
		person.setEmail("love20141002@126.com");
		repository.save(person);
		
		List<Person> persons = repository.findByLastname("Matthews");
		for(Person s :persons) {
			System.out.println(s);
		}
		return "home";
		
	}

}
