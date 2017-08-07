package com.mrs.nara;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mrs.nara.dao.QuestionDao;
import com.mrs.nara.vo.QuestionVo;

@Controller
public class QuestionController {
	
	private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);
	
	@Resource(name="questionDao")                 
    private QuestionDao questionDao;
	
	@RequestMapping(value="/NR_Question_S", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Question_S(ModelMap model, HttpServletRequest request, HttpSession session, QuestionVo vo) {
		
		List<QuestionVo> List = questionDao.getQuestionList(vo);

		if(List.size() > 0){

			model.addAttribute("rep_question", List);

		}else{

			logger.info("[No Data !]" );

		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_Question_I", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Question_I(ModelMap model, HttpServletRequest request, HttpSession session, QuestionVo vo) {
		
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setINSERTDATE(today);
		vo.setUPDATEDATE(today);

		int questionList = questionDao.setInQuestion(vo);
			
		if(questionList == 1){

			logger.info("[Success : "+questionList+"]");

			model.addAttribute("result", questionList);
		}else{

			logger.info("[Fail : "+questionList+"]");
			model.addAttribute("result", questionList);
		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_Question_U", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Question_U(ModelMap model, HttpServletRequest request, HttpSession session, QuestionVo vo) {
		
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setUPDATEDATE(today);

		int questionList = questionDao.setUpQuestion(vo);
			
		if(questionList == 1){

			logger.info("[Success : "+questionList+"]");
			model.addAttribute("result", questionList);
		}else{

			logger.info("[Fail : "+questionList+"]");
			model.addAttribute("result", questionList);
		}

		return "hello";
	}
	
	
	@RequestMapping(value="/NR_Question_D", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Question_D(ModelMap model, HttpServletRequest request, HttpSession session, QuestionVo vo) {

		int questionList = questionDao.setDelQuestion(vo);
			
		if(questionList == 1){

			logger.info("[Success : "+questionList+"]");
			model.addAttribute("result", questionList);
		}else{

			logger.info("[Fail : "+questionList+"]");
			model.addAttribute("result", questionList);
		}

		return "hello";
	}


}
