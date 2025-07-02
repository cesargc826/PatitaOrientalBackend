package com.patita.oriental.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController  //@Controller + @ResponseBody
@RequestMapping("/api/v1/user")
public class UserController {
	
}
