package com.ck.service.impl;

import com.ck.dao.BookTypeDao;
import com.ck.entity.booktype;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    private BookTypeDao bookTypeDao;
    public List<booktype> queryAll() {
        return bookTypeDao.queryAll();
    }
}
