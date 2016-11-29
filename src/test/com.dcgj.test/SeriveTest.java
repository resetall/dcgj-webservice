package com.dcgj.test;

import com.dcgj.web.entity.DecorItem;
import com.dcgj.web.entity.Feedback;
import com.dcgj.web.service.IDecorItemService;
import com.dcgj.web.service.IFeedbackService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 上午2:26
 * Desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class SeriveTest {

    @Autowired
    private IFeedbackService service;

    @Test
    public void testService(){
        Feedback record = new Feedback();
        record.setFeedbackContent("测试Service");
        record.setTelephone("110120119");
        record.setFeedbackDate(new Date());

        service.commitFeedback(record);
    }

    @Test
    public void testGetRecord(){
        List<Feedback> list;
        list = service.queryIsSolved(0);
        for (Feedback feedback : list){
            System.out.println("id: " + feedback.getId());
            System.out.println("content: " + feedback.getFeedbackContent());
        }
    }

    @Autowired
    private IDecorItemService decorItemService;
    @Test
    public void testDecorService(){
        String[] tags = new String[]{"中式"};
        List<DecorItem> items = decorItemService.getDecorItemsByTags(tags);
        for (DecorItem item : items){
            System.out.println("作者: " + item.getDesigner());
            System.out.println("点击量: " + item.getClickCount());
        }
    }

}
