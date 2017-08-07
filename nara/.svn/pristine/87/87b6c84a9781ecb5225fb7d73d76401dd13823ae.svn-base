package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.TalkHistoryVo;

public class TalkHistoryDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<TalkHistoryVo>  getTalkHistoryList(TalkHistoryVo vo)
    {
        List<TalkHistoryVo> list = new ArrayList<TalkHistoryVo>();

        try{

            list = getSqlSession().selectList("TalkHistory.getTalkHistoryList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }

    public int setInTalkHistory(TalkHistoryVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("TalkHistory.setInTalkHistory", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setUpTalkHistory(TalkHistoryVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("TalkHistory.setUpTalkHistory", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setDelTalkHistory(TalkHistoryVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("TalkHistory.setDelTalkHistory", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

     
}
