package com.ck.service.impl;

import com.ck.dao.BookInfoDao;
import com.ck.entity.bookinfo;
import com.ck.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookInfoServiceImpl implements BookInfoService {
   @Autowired
    private BookInfoDao bookInfoDao;
    public void addbookinfo(bookinfo bi) {
        bookInfoDao.addbookinfo(bi);
    }
}
