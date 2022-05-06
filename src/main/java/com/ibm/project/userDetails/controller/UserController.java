package com.ibm.project.userDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.project.userDetails.model.UserDetailsModel;
import com.ibm.project.userDetails.service.UserDetailsService;

@CrossOrigin
@RestController
@RequestMapping(value = "/ibm/project/user") 
public class UserController {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	 @GetMapping("/get/{aadharNumber}")    // GET Method for delete operation
	  public UserDetailsModel get(@PathVariable(value = "aadharNumber") String aadharNum) {
		 System.out.println("inside --controller");
		 System.out.println(aadharNum);
		
		  return userDetailsService.getVillage(aadharNum);
	  }

}
