package com.mrs.nara;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrs.nara.dao.EventDao;
import com.mrs.nara.dao.NoticeDao;
import com.mrs.nara.dao.QuestionDao;
import com.mrs.nara.dao.UserDao;
import com.mrs.nara.vo.EventVo;
import com.mrs.nara.vo.QuestionVo;
import com.mrs.nara.vo.UserVo;

@Controller
public class SubserviceController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userDao")                 
    private UserDao userDao;
	
	@Resource(name="questionDao")                 
    private QuestionDao questionDao;
	
	@Resource(name="noticeDao")                 
    private NoticeDao noticeDao;

	@Resource(name="eventDao")                 
    private EventDao eventDao;
	

	@RequestMapping(value="/subservice", method = {RequestMethod.GET,RequestMethod.POST})
	public String subservice(ModelMap model, Principal principal, HttpSession session, QuestionVo questionVo) {
 
		/*Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();*/
		
		/*User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();*/

		int page = 1;
		int countPage = 10;
		int startPage = ((page - 1) / 10) * 10 + 1;

		int endPage = startPage + countPage - 1;
		
		//qvo.setPAGE_NUM(startPage);
		//qvo.setPAGE_SIZE(endPage);
		System.out.println(questionVo);
	   //List<QuestionVo> question = questionDao.getUserList(questionVo);
		
		//user = userDao.UserTest(user);
		
		String name = principal.getName();
		System.out.println("name::"+name);
		
		
		model.addAttribute("username", name);
		
		//model.addAttribute("question", question);
		model.addAttribute("message", "Spring Security Hello World");
		return "subservice";
 
	}
	
	@RequestMapping(value="/SUBSERVICE", method = {RequestMethod.GET,RequestMethod.POST})
	public String SUBSERVICE(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

		EventVo evo  = new EventVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		evo.setPAGE_NUM(startPage);
		evo.setPAGE_SIZE(endPage);
		
	   List<EventVo> event_list = eventDao.getEventList(eventVo);
	   
		if(event_list.size() > 0){

			logger.info("[Success : "+event_list+"]");
		}else{

			logger.info("[Fail : "+event_list+"]");
		}
		model.addAttribute("EVENT_LIST", event_list);
		
		return "/subservice";
	}
	
	@RequestMapping(value="/SUBSERVICE_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void SUBSERVICE_I(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventI(eventVo);
		

		if(result != 0){
			logger.info("[Success : "+result+"]");
		}else{
			logger.info("[Fail : "+result+"]");
			result = -1;
		}
		
	    try {
	        response.getWriter().print(result);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }   
	}
	
	@RequestMapping(value="/SUBSERVICE_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void SUBSERVICE_U(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventU(eventVo);
		

		if(result != 0){
			logger.info("[Success : "+result+"]");
		}else{
			logger.info("[Fail : "+result+"]");
			result = -1;
		}
		
	    try {
	        response.getWriter().print(result);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }   
	}
	
	
	@RequestMapping(value="/SUBSERVICE_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void SUBSERVICE_D(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventD(eventVo);
		

		if(result != 0){
			logger.info("[Success : "+result+"]");
		}else{
			logger.info("[Fail : "+result+"]");
			result = -1;
		}
		
	    try {
	        response.getWriter().print(result);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }   
	}
	
	
	@RequestMapping(value="/SUBSERVICE_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String SUBSERVICE_O(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

	   List<EventVo> event_one = eventDao.getEventListOne(eventVo);
	   
		if(event_one.size() > 0){

			logger.info("[Success : "+event_one+"]");
		}else{

			logger.info("[Fail : "+event_one+"]");
		}
		model.addAttribute("EVENT_ONE", event_one);
		
		return "/subservice";
	}

}
