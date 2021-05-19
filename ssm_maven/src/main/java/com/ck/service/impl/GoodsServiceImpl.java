package com.ck.service.impl;

import com.ck.dao.GoodsDao;
import com.ck.entity.goods;
import com.ck.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao dao;
    public List<goods> queryAll() {
        return dao.queryAll();
    }
}
