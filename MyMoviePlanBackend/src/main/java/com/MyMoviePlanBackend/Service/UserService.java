package com.MyMoviePlanBackend.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyMoviePlanBackend.Entity.user;
import com.MyMoviePlanBackend.Repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
	
	public user getuserById(String emailid) {
		System.out.println("entered user service.... ");
		 Optional<user> usr = userrepo.findById(emailid);
			if(usr.isPresent()) {
				 return usr.get();
			 }
			 else {
				 return null;
			 }
		
	}
}
