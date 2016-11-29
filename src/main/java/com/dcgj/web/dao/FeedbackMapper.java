package com.dcgj.web.dao;

import com.dcgj.web.entity.Feedback;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 上午2:20
 * Desc:
 */

public interface FeedbackMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer id);

    ArrayList<Feedback> selectRecordIsSolved(Integer flag);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}