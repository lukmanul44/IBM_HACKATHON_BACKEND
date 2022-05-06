package com.ibm.project.userDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.project.userDetails.model.UserDetailsModel;
import com.ibm.project.userDetails.reposiory.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	UserDetailsModel userDetailsModel;
	
	public UserDetailsModel getVillage(String aadharNum) {
		System.out.println("inside --serviceImpl");
		
		return userDetailsRepository.findByAadharNumber(aadharNum);
		
	}

}
