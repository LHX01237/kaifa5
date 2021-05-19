package com.ck.service;

import com.ck.dao.IBookInfoDao;
import com.ck.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    private IBookInfoDao iBookInfoDao;
    public List<BookInfo> QueryAll() {
        return iBookInfoDao.QueryAll();
    }
}
