package com.dcgj.test;

import com.dcgj.web.dao.BrandNewMapper;
import com.dcgj.web.dao.DecorItemMapper;
import com.dcgj.web.dao.FeedbackMapper;
import com.dcgj.web.entity.BrandNew;
import com.dcgj.web.entity.DecorItem;
import com.dcgj.web.entity.Feedback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xav on 2016/10/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class DaoTest {

    @Autowired
    private FeedbackMapper mapper;

    @Test
    public void testDao(){

        Feedback feedback = new Feedback();
        feedback.setFeedbackContent("content");
        feedback.setTelephone("123456");
        feedback.setFeedbackDate(new Date());

        mapper.insertSelective(feedback);
    }

    @Test
    public void testDaoGet(){
        Feedback back = mapper.selectByPrimaryKey(1);

        System.out.println(back);

    }

    @Autowired
    private BrandNewMapper brandNewMapper;

    @Test
    public void testBrandNews(){
        List<BrandNew> list = brandNewMapper.selectNewsGroupByDate();
        for (BrandNew b : list){
            System.out.println("新闻标题: " + b.getNewsTitle());
            System.out.println("新闻ID: " + b.getNewsId());
        }
    }

    @Autowired
    private DecorItemMapper decorItemMapper;
    @Test
    public void testDecorDao(){
        List<DecorItem> items = decorItemMapper.selectByTags("tags like '%红色%'");
        for (DecorItem item : items){
            System.out.println(item.getDesigner());
        }
    }
}
