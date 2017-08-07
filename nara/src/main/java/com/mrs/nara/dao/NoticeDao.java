package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.NoticeVo;

public class NoticeDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<NoticeVo>  getNoticeList(NoticeVo vo)
    {
        List<NoticeVo> list = new ArrayList<NoticeVo>();

        try{

            list = getSqlSession().selectList("Notice.getNoticeList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }

    public int setInNotice(NoticeVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Notice.setInNotice", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setUpNotice(NoticeVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("Notice.setUpNotice", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setDelNotice(NoticeVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("Notice.setDelNotice", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

     
}
