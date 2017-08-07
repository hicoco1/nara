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

import com.mrs.nara.dao.BannedTermsDao;
import com.mrs.nara.dao.EventDao;
import com.mrs.nara.dao.NoticeDao;
import com.mrs.nara.dao.OperatorDao;
import com.mrs.nara.dao.QuestionDao;
import com.mrs.nara.dao.UserDao;
import com.mrs.nara.vo.BannedTermsVo;
import com.mrs.nara.vo.EventVo;
import com.mrs.nara.vo.OperatorAuthVo;
import com.mrs.nara.vo.OperatorLogVo;
import com.mrs.nara.vo.OperatorVo;
import com.mrs.nara.vo.QuestionVo;
import com.mrs.nara.vo.UserVo;

@Controller
public class BannedController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userDao")                 
    private UserDao userDao;
	
	@Resource(name="questionDao")                 
    private QuestionDao questionDao;
	
	@Resource(name="noticeDao")                 
    private NoticeDao noticeDao;
	
	@Resource(name="operatorDao")                 
    private OperatorDao operatorDao;
	
	@Resource(name="bannedtermsDao")                 
    private BannedTermsDao bannedtermsDao;
	
	
	

	@RequestMapping(value="/banned", method = {RequestMethod.GET,RequestMethod.POST})
	public String banned(ModelMap model, Principal principal, HttpSession session, BannedTermsVo bannedtermsVo) {
 
		int page = 1;
		int countPage = 10;
		int startPage = ((page - 1) / 10) * 10 + 1;
		int endPage = startPage + countPage - 1;

		String name = principal.getName();
		System.out.println("name::"+name);

		model.addAttribute("username", name);
		
		//model.addAttribute("question", question);
		model.addAttribute("message", "Spring Security Hello World");
		return "banned";
 
	}
	
	@RequestMapping(value="/BANNEDTERMS", method = {RequestMethod.GET,RequestMethod.POST})
	public String BANNEDTERMS(ModelMap model, Principal principal, HttpSession session,BannedTermsVo bannedtermsVo) {

		BannedTermsVo bvo  = new BannedTermsVo();
		int page = 1;
		int countPage = 10;
		String startPage = ((page - 1) / 10) * 10 + 1 + "";
		String endPage = Integer.parseInt(startPage) + countPage - 1 + "";
		bvo.setPAGE_NUM(startPage);
		bvo.setPAGE_SIZE(endPage);
		
	   List<BannedTermsVo> bannedterms_list = bannedtermsDao.getBannedTermsList(bannedtermsVo);
	   
		if(bannedterms_list.size() > 0){

			logger.info("[Success : "+bannedterms_list+"]");
		}else{

			logger.info("[Fail : "+bannedterms_list+"]");
		}
		model.addAttribute("BANNEDTERMS_LIST", bannedterms_list);
		
		return "/banned";
	}
	
	
	@RequestMapping(value="/BANNEDTERMS_I", method = {RequestMethod.GET,RequestMethod.POST})
	public void BANNEDTERMS_I(ModelMap model, Principal principal, HttpSession session, BannedTermsVo bannedtermsVo , HttpServletRequest request, HttpServletResponse response) {
 
		

	   int result = bannedtermsDao.setBannedTermsI(bannedtermsVo);
		

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
	
	@RequestMapping(value="/BANNEDTERMS_U", method = {RequestMethod.GET,RequestMethod.POST})
	public void BANNEDTERMS_U(ModelMap model, Principal principal, HttpSession session, BannedTermsVo bannedtermsVo  , HttpServletRequest request, HttpServletResponse response) {
 

	   int result = bannedtermsDao.setBannedTermsU(bannedtermsVo);
		

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
	
	
	@RequestMapping(value="/BANNEDTERMS_D", method = {RequestMethod.GET,RequestMethod.POST})
	public void BANNEDTERMS_D(ModelMap model, Principal principal, HttpSession session, BannedTermsVo bannedtermsVo ,  HttpServletRequest request, HttpServletResponse response) {
 
		
	   int result = bannedtermsDao.setBannedTermsD(bannedtermsVo);
		
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
	
	
	@RequestMapping(value="/BANNEDTERMS_O", method = {RequestMethod.GET,RequestMethod.POST})
	public String BANNEDTERMS_O(ModelMap model, Principal principal, HttpSession session, BannedTermsVo bannedtermsVo ) {

	   List<BannedTermsVo> bannedterms_one = bannedtermsDao.getBannedTermsListOne(bannedtermsVo);
	   
		if(bannedterms_one.size() > 0){

			logger.info("[Success : "+bannedterms_one+"]");
		}else{

			logger.info("[Fail : "+bannedterms_one+"]");
		}
		model.addAttribute("BANNEDTERMS_ONE", bannedterms_one);
		
		return "/banned";
	}
	

}
