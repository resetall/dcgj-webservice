package com.dcgj.web.service.impl;

import com.dcgj.web.dao.FeedbackMapper;
import com.dcgj.web.entity.Feedback;
import com.dcgj.web.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 上午2:24
 * Desc:
 */
@Service("feedbackService")
public class FeedbackServiceImpl implements IFeedbackService {

    @Autowired
    private FeedbackMapper mapper;

    @Transactional
    public void commitFeedback(Feedback feedback) {
        mapper.insertSelective(feedback);
    }

    public ArrayList<Feedback> queryIsSolved(int flag) {
        return mapper.selectRecordIsSolved(flag);
    }
}
