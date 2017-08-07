package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.EventVo;
import com.mrs.nara.vo.OperatorAuthVo;
import com.mrs.nara.vo.OperatorLogVo;
import com.mrs.nara.vo.OperatorVo;

public class OperatorDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<OperatorVo> getOperatorList(OperatorVo vo)
    {
        List<OperatorVo> list = new ArrayList<OperatorVo>();

        try{

            list = getSqlSession().selectList("Operator.getOperatorList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }

    
    public List<OperatorLogVo> getOperatorLogList(OperatorLogVo vo)
    {
        List<OperatorLogVo> list = new ArrayList<OperatorLogVo>();

        try{

            list = getSqlSession().selectList("Operator.getOperatorLogList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }
    
    public List<OperatorVo>  getOperatorListOne(OperatorVo vo)
    {
        List<OperatorVo> list = new ArrayList<OperatorVo>();
        try
        {
            list = getSqlSession().selectList("Operator.getOperatorListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }

    public int setOperatorI(OperatorVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Operator.setOperatorI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setOperatorU(OperatorVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("Operator.setOperatorU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setOperatorD(OperatorVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("Operator.setOperatorD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public List<OperatorAuthVo> getOperatorAuthList(OperatorAuthVo vo)
    {
        List<OperatorAuthVo> list = new ArrayList<OperatorAuthVo>();

        try{

            list = getSqlSession().selectList("Operator.getOperatorAuthList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }

    public List<OperatorAuthVo>  getOperatorAuthListOne(OperatorAuthVo vo)
    {
        List<OperatorAuthVo> list = new ArrayList<OperatorAuthVo>();
        try
        {
            list = getSqlSession().selectList("Operator.getOperatorAuthOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }

    public int setOperatorAuthI(OperatorAuthVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Operator.setOperatorAuthI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setOperatorAuthU(OperatorAuthVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("Operator.setOperatorAuthU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setOperatorAuthD(OperatorAuthVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("Operator.setOperatorAuthD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    
}
