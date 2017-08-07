package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.EventVo;
import com.mrs.nara.vo.EventVo;


public class EventDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(EventDao.class);


    public List<EventVo>  getEventList(EventVo vo)
    {
        List<EventVo> list = new ArrayList<EventVo>();
        try
        {
            list = getSqlSession().selectList("Event.getEventList", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    public List<EventVo>  getEventListOne(EventVo vo)
    {
        List<EventVo> list = new ArrayList<EventVo>();
        try
        {
            list = getSqlSession().selectList("Event.getEventListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    
    public int setEventI(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    public int setEventU(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    public int setEventD(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    
    public List<EventVo>  getEventQuestionList(EventVo vo)
    {
        List<EventVo> list = new ArrayList<EventVo>();
        try
        {
            list = getSqlSession().selectList("Event.getEventQuestionList", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    public List<EventVo>  getEventQuestionListOne(EventVo vo)
    {
        List<EventVo> list = new ArrayList<EventVo>();
        try
        {
            list = getSqlSession().selectList("Event.getEventQuestionListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    
    public int setEventQuestionI(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventQuestionI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    public int setEventQuestionU(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventQuestionU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    public int setEventQuestionD(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventQuestionD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
    
    public List<EventVo>  getEventAnswerListOne(EventVo vo)
    {
        List<EventVo> list = new ArrayList<EventVo>();
        try
        {
            list = getSqlSession().selectList("Event.getEventAnswerListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    
    public int setEventAnswerI(EventVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Event.setEventAnswerI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }
}
