package com.dcgj.web.service;

import com.dcgj.web.entity.Feedback;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 上午2:23
 * Desc:
 */
public interface IFeedbackService {

    void commitFeedback(Feedback feedback);

    ArrayList<Feedback> queryIsSolved(int flag);

}
