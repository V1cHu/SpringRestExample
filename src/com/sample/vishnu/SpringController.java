package com.sample.vishnu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Info;

@RestController
@RequestMapping("/application")
public class SpringController {

	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
	public Object getGreeting(@PathVariable("name") String firstName,
			@RequestHeader("sname") String secondName,@RequestHeader String address) {

		Info info = new Info();
		info.setFname(firstName);
		info.setSname(secondName);
		info.setAddress(address);
		
		return info;
	}
	
	@RequestMapping(value = "/postuser", method = RequestMethod.POST)
	public Info getGreeting(@RequestBody Info info) {
		
		return info;
	}

}
