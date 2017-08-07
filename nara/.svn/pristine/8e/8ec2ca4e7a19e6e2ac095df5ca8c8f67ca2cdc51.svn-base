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

import com.mrs.nara.dao.TalkHistoryDao;
import com.mrs.nara.vo.TalkHistoryVo;

@Controller
public class TalkHistoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(TalkHistoryController.class);
	
	@Resource(name="talkhistoryDao")
    private TalkHistoryDao talkhistoryDao;

	@RequestMapping(value="/NR_TalkHistory_S", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_TalkHistory_S(ModelMap model, HttpServletRequest request, HttpSession session, TalkHistoryVo vo) {
		
		List<TalkHistoryVo> List = talkhistoryDao.getTalkHistoryList(vo);

		if(List.size() > 0){

			model.addAttribute("rep_talkhistory", List);

		}else{

			logger.info("[No Data !]");

		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_TalkHistory_I", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_TalkHistory_I(ModelMap model, HttpServletRequest request, HttpSession session, TalkHistoryVo vo) {
		
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setINSERTDATE(today);
		vo.setUPDATEDATE(today);

		int List = talkhistoryDao.setInTalkHistory(vo);
			
		if(List == 1){

			logger.info("[Success : "+List+"]");
			model.addAttribute("result", List);
		}else{

			logger.info("[Fail : "+List+"]");
			model.addAttribute("result", List);
		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_TalkHistory_U", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_TalkHistory_U(ModelMap model, HttpServletRequest request, HttpSession session, TalkHistoryVo vo) {
	
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setUPDATEDATE(today);

		int List = talkhistoryDao.setUpTalkHistory(vo);
			
		if(List == 1){

			logger.info("[Success : "+List+"]");
			model.addAttribute("result", List);
		}else{

			logger.info("[Fail : "+List+"]");
			model.addAttribute("result", List);
		}

		return "hello";
	}
	
	
	@RequestMapping(value="/NR_TalkHistory_D", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_TalkHistory_D(ModelMap model, HttpServletRequest request, HttpSession session, TalkHistoryVo vo) {
		
		int List = talkhistoryDao.setDelTalkHistory(vo);
			
		if(List == 1){

			logger.info("[Success : "+List+"]");
			model.addAttribute("result", List);
		}else{

			logger.info("[Fail : "+List+"]");
			model.addAttribute("result", List);
		}

		return "hello";
	}

}
