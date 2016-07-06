package com.chenfeng.school.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Secured("ROLE_ADMIN")
	public void secureMethod() {
		// nothing
	}

	public void publicMethod() {
		// nothing
	}

}