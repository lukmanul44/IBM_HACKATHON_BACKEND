package com.ibm.project.userDetails.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.project.userDetails.model.UserDetailsModel;
public interface UserDetailsRepository extends JpaRepository<UserDetailsModel,Long> {

	UserDetailsModel findByAadharNumber(String aadharNum);

}
