package com.mrs.nara;

import java.security.Principal;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mrs.nara.dao.UserDao;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userDao")                 
    private UserDao userDao;


	@RequestMapping(value="/welcome", method = {RequestMethod.GET,RequestMethod.POST})
	public String printWelcome(ModelMap model, Principal principal, HttpSession session ) {
 
		return "hello";
 
	}
 
	@RequestMapping(value = {"/","/Login","/logout"},method = { RequestMethod.GET, RequestMethod.POST } )
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpSession session, HttpServletRequest request) {
		logger.info("<<<<<<<<<<<<<< START login >>>>>>>>>>>>>>" );
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		session.setAttribute("CSRF_TOKEN", UUID.randomUUID().toString());
		System.out.println("UUID.randomUUID().toString()1====="+UUID.randomUUID().toString()); 
		model.setViewName("login");
		logger.info("<<<<<<<<<<<<<< END login >>>>>>>>>>>>>>" );
		return model;

	}

	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
	
}
