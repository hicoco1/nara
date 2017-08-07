package com.mrs.nara.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mrs.nara.vo.QuestionVo;

public class QuestionDao extends SqlSessionDaoSupport
{
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);;

    public List<QuestionVo> getQuestionList(QuestionVo vo)
    {
        List<QuestionVo> list = new ArrayList<QuestionVo>();

        try{

            list = getSqlSession().selectList("Question.getQuestionList", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return list;
    }

    public int setInQuestion(QuestionVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().insert("Question.setInQuestion", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setUpQuestion(QuestionVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().update("Question.setUpQuestion", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

    public int setDelQuestion(QuestionVo vo)
    {
        int result = 0;

        try{
        	
            result = getSqlSession().delete("Question.setDelQuestion", vo);

        }catch (Exception e){
            logger.debug("ERROR : " + e.toString());
        }        

        return result;
    }

     
}
