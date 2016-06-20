package com.chenfeng.school.site.controller;

import javax.annotation.security.RolesAllowed;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "user")
public class UserController {
    Logger log = Logger.getLogger(UserController.class);
	
    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String createSympotm() {
        return "user/login";
    }
    
    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
//    @RolesAllowed("")
    public String test() {
    	return "user/test";
    }
    
    @RequestMapping(value = "test1", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @RolesAllowed("{ROLE_ADMIN}")
    public String test1() {
    	
    	return "user/test1";
    }
    
    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @RolesAllowed("{ROLE_USER}")
    public String test2() {
    	return "user/test2";
    }
}
