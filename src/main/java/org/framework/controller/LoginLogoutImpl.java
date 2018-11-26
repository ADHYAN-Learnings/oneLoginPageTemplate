package org.framework.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginLogoutImpl {
	private static final Logger logger = LoggerFactory.getLogger(LoginLogoutImpl.class);
	
	@RequestMapping(value = {"/login"},method=RequestMethod.GET)
	public String getLogin() {
	logger.debug("::DefaultController:::getLogin:::");	
		return "login";
	}
	
	@RequestMapping(value = "/logout",method=RequestMethod.GET)
	public String getLogout(HttpServletRequest request,HttpServletResponse response) {
	  logger.debug("::DefaultController:::getLogout:::");
	  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	  if(authentication != null) {
		  new SecurityContextLogoutHandler().logout(request, response, authentication);
	  }
	  return "redirect:/?logout";
	}
		
}
