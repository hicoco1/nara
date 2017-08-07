package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.SubserviceVo;
import com.mrs.nara.vo.EventVo;

public class Dao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<SubserviceVo> getSubserviceList(SubserviceVo vo)
    {
        List<SubserviceVo> list = new ArrayList<SubserviceVo>();

        try{

            list = getSqlSession().selectList("Subservice.getSubserviceList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }
    
    public List<SubserviceVo>  getSubserviceListOne(SubserviceVo vo)
    {
        List<SubserviceVo> list = new ArrayList<SubserviceVo>();
        try
        {
            list = getSqlSession().selectList("Subservice.getSubserviceListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }

    public int setSubserviceI(SubserviceVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Subservice.setSubserviceI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setSubserviceU(SubserviceVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("Subservice.setSubserviceU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setSubserviceD(SubserviceVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("Subservice.setSubserviceD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

     
}
