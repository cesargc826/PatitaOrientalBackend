package com.patita.oriental.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontendController implements ErrorController {

	/*@RequestMapping({"/{path:[^\\.]*}"})
	public String forward() {
		return "forward:/index.html";
	}*/
	
	@RequestMapping("/error") public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		/*if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());
			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				return "forward:/index.html";
			}
			
		}
		return "error";*/
		return "forward:/index.html";
	}
	
	
}
