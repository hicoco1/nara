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
public class EventController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userDao")                 
    private UserDao userDao;
	
	@Resource(name="questionDao")                 
    private QuestionDao questionDao;
	
	@Resource(name="noticeDao")                 
    private NoticeDao noticeDao;

	@Resource(name="eventDao")                 
    private EventDao eventDao;
	

	@RequestMapping(value="/event", method = {RequestMethod.GET,RequestMethod.POST})
	public String question(ModelMap model, Principal principal, HttpSession session, QuestionVo questionVo) {
 
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
		return "event";
 
	}
	
	@RequestMapping(value="/EVENT", method = {RequestMethod.GET,RequestMethod.POST})
	public String evnet(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

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
		
		return "/event";
	}
	
	@RequestMapping(value="/EVENT_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_I(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
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
	
	@RequestMapping(value="/EVENT_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_U(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
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
	
	
	@RequestMapping(value="/EVENT_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_D(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
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
	
	
	@RequestMapping(value="/EVENT_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String EVENT_O(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

	   List<EventVo> event_one = eventDao.getEventListOne(eventVo);
	   
		if(event_one.size() > 0){

			logger.info("[Success : "+event_one+"]");
		}else{

			logger.info("[Fail : "+event_one+"]");
		}
		model.addAttribute("EVENT_ONE", event_one);
		
		return "/event";
	}
	
	
	@RequestMapping(value="/EVENT_QUESTION", method = {RequestMethod.GET,RequestMethod.POST})
	public String EVENT_QUESTION(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

		EventVo evo  = new EventVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		evo.setPAGE_NUM(startPage);
		evo.setPAGE_SIZE(endPage);
		
	   List<EventVo> event_question_list = eventDao.getEventQuestionList(eventVo);
	   
		if(event_question_list.size() > 0){

			logger.info("[Success : "+event_question_list+"]");
		}else{

			logger.info("[Fail : "+event_question_list+"]");
		}
		model.addAttribute("EVENT_QUESTION_LIST", event_question_list);
		
		return "/event";
	}
	
	@RequestMapping(value="/EVENT_QUESTION_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_QUESTION_I(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventQuestionI(eventVo);
		

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
	
	@RequestMapping(value="/EVENT_QUESTION_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_QUESTION_U(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventQuestionU(eventVo);
		

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
	
	
	@RequestMapping(value="/EVENT_QUESTION_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_QUESTION_D(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   int result = eventDao.setEventQuestionD(eventVo);
		

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
	
	
	@RequestMapping(value="/EVENT_QUESTION_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String EVENT_QUESTION_O(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

	   List<EventVo> event_question_one = eventDao.getEventQuestionListOne(eventVo);
	   
		if(event_question_one.size() > 0){

			logger.info("[Success : "+event_question_one+"]");
		}else{

			logger.info("[Fail : "+event_question_one+"]");
		}
		model.addAttribute("EVENT_QUESTION_ONE", event_question_one);
		
		return "/event";
	}

	@RequestMapping(value="/EVENT_ANSWER_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void EVENT_ANSWER_I(ModelMap model, Principal principal, HttpSession session, EventVo eventVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   eventVo.setOPERATOR("bjs");
	   
	   String OBJECTIVE_ANSWER	= "0" ;
	   
	   String SUBJECTIVE_ANSWER = "0"; 
	   
	   eventVo.setEVENT_WIN_FLAG(OBJECTIVE_ANSWER);
	   eventVo.setCORRECT_FLAG(SUBJECTIVE_ANSWER);
	   int result = eventDao.setEventAnswerI(eventVo);
		

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
	
	@RequestMapping(value="/EVENT_ANSWER_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String EVENT_ANSWER_O(ModelMap model, Principal principal, HttpSession session, EventVo eventVo) {

	   List<EventVo> event_answer_one = eventDao.getEventAnswerListOne(eventVo);
	   
		if(event_answer_one.size() > 0){

			logger.info("[Success : "+event_answer_one+"]");
		}else{

			logger.info("[Fail : "+event_answer_one+"]");
		}
		model.addAttribute("EVENT_ANSWER_ONE", event_answer_one);
		
		return "/event";
	}

}
