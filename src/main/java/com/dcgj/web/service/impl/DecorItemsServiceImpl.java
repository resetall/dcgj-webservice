package com.dcgj.web.service.impl;

import com.dcgj.web.dao.DecorItemMapper;
import com.dcgj.web.entity.DecorItem;
import com.dcgj.web.service.IDecorItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午2:49
 * Desc:
 */
@Service("decorItemsService")
public class DecorItemsServiceImpl implements IDecorItemService {

    @Autowired
    private DecorItemMapper mapper;

    public List<DecorItem> getDecorItemsByTags(String[] tags) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<tags.length;i++){
            if (tags.length != i+1){
                sb.append("tags like '%");
                sb.append(tags[i]);
                sb.append("%' and ");
            }else{
                sb.append("tags like '%");
                sb.append(tags[i]);
                sb.append("%'");
            }
        }
        return mapper.selectByTags(sb.toString());
    }

    public List<DecorItem> getAllDecorItems() {
        return mapper.selectAllRecord();
    }

    public int addDecorItem(DecorItem item) {
        return 0;
    }
}
