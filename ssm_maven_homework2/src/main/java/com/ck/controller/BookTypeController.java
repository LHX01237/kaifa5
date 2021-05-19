package com.ck.controller;

import com.ck.entity.booktype;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class BookTypeController {
    @Autowired
    private BookTypeService bookTypeService;
    @RequestMapping("queryAllajax")
    @ResponseBody
    public List<booktype> queryAllajax(){
        List<booktype> booktypes = bookTypeService.queryAll();
        return booktypes;
    }
}
