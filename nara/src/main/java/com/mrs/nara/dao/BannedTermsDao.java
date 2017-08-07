package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.BannedTermsVo;
import com.mrs.nara.vo.EventVo;

public class BannedTermsDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<BannedTermsVo> getBannedTermsList(BannedTermsVo vo)
    {
        List<BannedTermsVo> list = new ArrayList<BannedTermsVo>();

        try{

            list = getSqlSession().selectList("BannedTerms.getBannedTermsList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }
    
    public List<BannedTermsVo>  getBannedTermsListOne(BannedTermsVo vo)
    {
        List<BannedTermsVo> list = new ArrayList<BannedTermsVo>();
        try
        {
            list = getSqlSession().selectList("BannedTerms.getBannedTermsListOne", vo);
        } catch (Exception e)
        {
            logger.debug("ERROR : " + e.toString());
        }        
        return list;
    }

    public int setBannedTermsI(BannedTermsVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("BannedTerms.setBannedTermsI", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setBannedTermsU(BannedTermsVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("BannedTerms.setBannedTermsU", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setBannedTermsD(BannedTermsVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("BannedTerms.setBannedTermsD", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

     
}
