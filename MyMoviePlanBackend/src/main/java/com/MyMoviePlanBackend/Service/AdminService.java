package com.MyMoviePlanBackend.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyMoviePlanBackend.Entity.Admin;
import com.MyMoviePlanBackend.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminrepo;
	
	public Admin getAdminById(String emailid) {
		return adminrepo.findById(emailid).get();
	}
	public Admin updatepass(Admin adm) {
		Admin admin=adminrepo.findById(adm.getEmailid()).get();
		
		admin.setPass(adm.getPass());	
		return adminrepo.save(admin);
	}
}
