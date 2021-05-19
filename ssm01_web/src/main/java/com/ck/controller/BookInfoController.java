package com.ck.controller;

import com.ck.entity.BookInfo;
import com.ck.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.faces.annotation.RequestMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;
    @RequestMapping("All")
    public String All(Map map){
        List<BookInfo> bookInfos = bookInfoService.QueryAll();
        map.put("ALLs", bookInfos);
        return "1";
    }
}
