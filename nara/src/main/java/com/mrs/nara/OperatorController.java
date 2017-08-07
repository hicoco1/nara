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
import com.mrs.nara.dao.OperatorDao;
import com.mrs.nara.dao.QuestionDao;
import com.mrs.nara.dao.UserDao;
import com.mrs.nara.vo.EventVo;
import com.mrs.nara.vo.OperatorAuthVo;
import com.mrs.nara.vo.OperatorLogVo;
import com.mrs.nara.vo.OperatorVo;
import com.mrs.nara.vo.QuestionVo;
import com.mrs.nara.vo.UserVo;

@Controller
public class OperatorController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userDao")                 
    private UserDao userDao;
	
	@Resource(name="questionDao")                 
    private QuestionDao questionDao;
	
	@Resource(name="noticeDao")                 
    private NoticeDao noticeDao;
	
	@Resource(name="operatorDao")                 
    private OperatorDao operatorDao;
	
	
	

	@RequestMapping(value="/operator", method = {RequestMethod.GET,RequestMethod.POST})
	public String operator(ModelMap model, Principal principal, HttpSession session, QuestionVo questionVo) {
 
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
		return "operator";
 
	}
	
	@RequestMapping(value="/OPERATOR", method = {RequestMethod.GET,RequestMethod.POST})
	public String OPERATOR(ModelMap model, Principal principal, HttpSession session, OperatorVo operatorVo) {

		EventVo evo  = new EventVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		evo.setPAGE_NUM(startPage);
		evo.setPAGE_SIZE(endPage);
		
	   List<OperatorVo> operator_list = operatorDao.getOperatorList(operatorVo);
	   
		if(operator_list.size() > 0){

			logger.info("[Success : "+operator_list+"]");
		}else{

			logger.info("[Fail : "+operator_list+"]");
		}
		model.addAttribute("OPERATOR_LIST", operator_list);
		
		return "/operator";
	}
	
	@RequestMapping(value="/OPERATOR_LOG", method = {RequestMethod.GET,RequestMethod.POST})
	public String OPERATOR_LOG(ModelMap model, Principal principal, HttpSession session, OperatorLogVo operatorlogVo) {

		EventVo evo  = new EventVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		evo.setPAGE_NUM(startPage);
		evo.setPAGE_SIZE(endPage);
		
	   List<OperatorLogVo> operator_log_list = operatorDao.getOperatorLogList(operatorlogVo);
	   
		if(operator_log_list.size() > 0){

			logger.info("[Success : "+operator_log_list+"]");
		}else{

			logger.info("[Fail : "+operator_log_list+"]");
		}
		model.addAttribute("OPERATOR_LOG_LIST", operator_log_list);
		
		return "/operator";
	}
	
	@RequestMapping(value="/OPERATOR_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_I(ModelMap model, Principal principal, HttpSession session, OperatorVo operatorVo , HttpServletRequest request, HttpServletResponse response) {
 
		
		operatorVo.setINSERT_ID("bjs");
		operatorVo.setUPDATE_ID("bjs");
	   int result = operatorDao.setOperatorI(operatorVo);
		

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
	
	@RequestMapping(value="/OPERATOR_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_U(ModelMap model, Principal principal, HttpSession session, OperatorVo operatorVo , HttpServletRequest request, HttpServletResponse response) {
 
		operatorVo.setINSERT_ID("bjs");
		operatorVo.setUPDATE_ID("bjs");
	   int result = operatorDao.setOperatorU(operatorVo);
		

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
	
	
	@RequestMapping(value="/OPERATOR_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_D(ModelMap model, Principal principal, HttpSession session,OperatorVo operatorVo ,  HttpServletRequest request, HttpServletResponse response) {
 
		
	   int result = operatorDao.setOperatorD(operatorVo);
		
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
	
	
	@RequestMapping(value="/OPERATOR_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String OPERATOR_O(ModelMap model, Principal principal, HttpSession session,OperatorVo operatorVo ) {

	   List<OperatorVo> operator_one = operatorDao.getOperatorListOne(operatorVo);
	   
		if(operator_one.size() > 0){

			logger.info("[Success : "+operator_one+"]");
		}else{

			logger.info("[Fail : "+operator_one+"]");
		}
		model.addAttribute("OPERATOR_ONE", operator_one);
		
		return "/operator";
	}
	
	
	@RequestMapping(value="/OPERATOR_AUTH", method = {RequestMethod.GET,RequestMethod.POST})
	public String OPERATOR_AUTH(ModelMap model, Principal principal, HttpSession session, OperatorAuthVo operatorAuthVo) {

		EventVo evo  = new EventVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		evo.setPAGE_NUM(startPage);
		evo.setPAGE_SIZE(endPage);
		
	   List<OperatorAuthVo> operator_auth_list = operatorDao.getOperatorAuthList(operatorAuthVo);
	   
		if(operator_auth_list.size() > 0){

			logger.info("[Success : "+operator_auth_list+"]");
		}else{

			logger.info("[Fail : "+operator_auth_list+"]");
		}
		model.addAttribute("OPERATOR_AUTH_LIST", operator_auth_list);
		
		return "/operator";
	}
	
	@RequestMapping(value="/OPERATOR_AUTH_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_AUTH_I(ModelMap model, Principal principal, HttpSession session, OperatorAuthVo operatorAuthVo, HttpServletRequest request, HttpServletResponse response) {
		
	   int result = operatorDao.setOperatorAuthI(operatorAuthVo);
		
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
	
	@RequestMapping(value="/OPERATOR_AUTH_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_AUTH_U(ModelMap model, Principal principal, HttpSession session, OperatorAuthVo operatorAuthVo, HttpServletRequest request, HttpServletResponse response) {
 
	   int result = operatorDao.setOperatorAuthU(operatorAuthVo);
		
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
	
	
	@RequestMapping(value="/OPERATOR_AUTH_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void OPERATOR_AUTH_D(ModelMap model, Principal principal, HttpSession session, OperatorAuthVo operatorAuthVo, HttpServletRequest request, HttpServletResponse response) {
 
		
	   int result = operatorDao.setOperatorAuthD(operatorAuthVo);
		

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
	
	
	@RequestMapping(value="/OPERATOR_AUTH_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String OPERATOR_AUTH_O(ModelMap model, Principal principal, HttpSession session, OperatorAuthVo operatorAuthVo) {

	   List<OperatorAuthVo> operator_auth_one = operatorDao.getOperatorAuthListOne(operatorAuthVo);
	   
		if(operator_auth_one.size() > 0){

			logger.info("[Success : "+operator_auth_one+"]");
		}else{

			logger.info("[Fail : "+operator_auth_one+"]");
		}
		model.addAttribute("OPERATOR_AUTH_ONE", operator_auth_one);
		
		return "/operator";
	}

}
