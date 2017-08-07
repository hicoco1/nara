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

import com.mrs.nara.dao.NoticeDao;
import com.mrs.nara.vo.NoticeVo;

@Controller
public class NoticeController {
	
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);

	@Resource(name="noticeDao")
    private NoticeDao noticeDao;

	@RequestMapping(value="/NR_Notice_S", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Notice_S(ModelMap model, HttpServletRequest request, HttpSession session, NoticeVo vo) {
		
		List<NoticeVo> List = noticeDao.getNoticeList(vo);

		if(List.size() > 0){

			model.addAttribute("rep_notice", List);

		}else{

			logger.info("[No Data !]");

		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_Notice_I", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Notice_I(ModelMap model, HttpServletRequest request, HttpSession session, NoticeVo vo) {
		
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setINSERTDATE(today);
		vo.setUPDATEDATE(today);

		int List = noticeDao.setInNotice(vo);
			
		if(List == 1){

			logger.info("[Success : "+List+"]");
			model.addAttribute("result", List);
		}else{

			logger.info("[Fail : "+List+"]");
			model.addAttribute("result", List);
		}

		return "hello";
 
	}
	
	@RequestMapping(value="/NR_Notice_U", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Notice_U(ModelMap model, HttpServletRequest request, HttpSession session, NoticeVo vo) {
	
		String today = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		vo.setUPDATEDATE(today);

		int List = noticeDao.setUpNotice(vo);
			
		if(List == 1){

			logger.info("[Success : "+List+"]");
			model.addAttribute("result", List);
		}else{

			logger.info("[Fail : "+List+"]");
			model.addAttribute("result", List);
		}

		return "hello";
	}
	
	
	@RequestMapping(value="/NR_Notice_D", method = {RequestMethod.GET,RequestMethod.POST})
	public String NR_Notice_D(ModelMap model, HttpServletRequest request, HttpSession session, NoticeVo vo) {

		int List = noticeDao.setDelNotice(vo);
			
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
