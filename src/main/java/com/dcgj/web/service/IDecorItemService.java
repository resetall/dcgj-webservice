package com.dcgj.web.service;

import com.dcgj.web.entity.DecorItem;

import java.util.List;

/**
 * Created with IntelliJ IDEA by Xav.
 * Date: 2016/10/23
 * Time: 下午2:45
 * Desc:
 */
public interface IDecorItemService {

    List<DecorItem> getDecorItemsByTags(String[] tags);

    List<DecorItem> getAllDecorItems();

    int addDecorItem(DecorItem item);

}
