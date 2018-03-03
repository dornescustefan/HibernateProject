package com.project3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project3.model.Phone;

@RestController
public class RESTController {
	//REST API Controller
			@RequestMapping(value="phonemakes", method = RequestMethod.GET)
			public List<Phone> getPhoneMakes(){
				List<Phone>  phoneMakes= new ArrayList<Phone>() ;
				Phone phone1 = new Phone();
				Phone phone2 = new Phone();
				Phone phone3 = new Phone();
				Phone phone4 = new Phone();
				Phone phone5 = new Phone();
				
				phone1.setPhoneMake("Iphone");
				phone2.setPhoneMake("Samsung");
				phone3.setPhoneMake("Nokia");
				phone4.setPhoneMake("HTC");
				phone5.setPhoneMake("Sony Ericsson");
				
				phoneMakes.add(phone1);
				phoneMakes.add(phone2);
				phoneMakes.add(phone3);
				phoneMakes.add(phone4);
				phoneMakes.add(phone5);
				
				return phoneMakes;
				}
		

}
