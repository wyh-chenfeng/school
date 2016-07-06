package com.chenfeng.school.site.controller;

import java.nio.file.AccessDeniedException;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "user")
public class UserController {
    Logger log = Logger.getLogger(UserController.class);
	
//    @Autowired
//    private UserService userService; 
    
    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String createSympotm() {
        return "user/login";
    }
    
    @RequestMapping(value = "test3", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String test() {
    	return "user/test";
    }
    
    @RequestMapping(value = "test1", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @Secured("ROLE_ADMIN")
    public String test1() throws AccessDeniedException {
    	return "user/test1";
    }
    
    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @Secured("ROLE_USER")
    public String test2() {
    	
    	return "user/test2";
    }
}
