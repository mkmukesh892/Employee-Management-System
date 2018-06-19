package com.fico.ems.controller;
import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fico.ems.model.User;
import com.fico.ems.service.UserService;

@RestController
public class LoginController {
@Autowired
private UserService userService;

@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
public void createNewEmployee(@RequestBody User user) {
	
		userService.saveUser(user);
		 
		
	}
@RequestMapping(value="/users" , method=RequestMethod.GET)
public List<User> listOfUsers(){
	return userService.getAllUser();
}
@RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
public void deleteUser(@RequestBody User user) {
	
		userService.deleteUser(user);
		 
		
	}	
@RequestMapping(value="/validate", method=RequestMethod.GET)
@ResponseStatus
public ResponseEntity validateUser(@RequestParam String email, @RequestParam String password) {
	User usrExists=userService.findUserByEmail(email);
	if(usrExists==null)
		return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
	else if(email.equalsIgnoreCase(usrExists.getEmail()) && password.equals(usrExists.getPassword())) {
		return new ResponseEntity(HttpStatus.ACCEPTED);
		
	}
	else {
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
}

}
