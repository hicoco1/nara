package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import  com.mrs.nara.vo.UserVo;

public class UserDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public UserVo UserTest(UserVo vo)
    {    	    	
    	UserVo data = null;
        try
        {                    	
        	data = getSqlSession().selectOne("User.getTest", vo);        	        
        	
        } catch (Exception e) { logger.debug("ERROR : " + e.toString()); }
        return data;
    }
	
    
    public UserVo UserDetail(UserVo vo)
    {    	    	
    	UserVo data = null;
        try
        {                    	
        	data = getSqlSession().selectOne("User.getUser", vo);        	        
        	
        } catch (Exception e) { logger.debug("ERROR : " + e.toString()); }
        return data;
    }
	
    
    
    public List<UserVo>  getUserList(UserVo vo)
    {
        List<UserVo> list = new ArrayList<UserVo>();
        try
        {
            list = getSqlSession().selectList("User.getUserList", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }
    
    
    public int  getUserListCount(UserVo vo)
    {
        int count = 0;
        try
        {
            count = getSqlSession().selectOne("User.getUserListCount", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return count;
    }
    
   
}
