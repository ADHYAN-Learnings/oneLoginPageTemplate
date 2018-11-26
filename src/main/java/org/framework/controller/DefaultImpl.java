/* @Author Aditya Pandey
 * 11 Nov 2018
 */
package org.framework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class DefaultImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(DefaultImpl.class);
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String getLandingPage() {
	logger.debug("::DefaultController:::getLandingPage:::");
		return "homePage";
	}

}
