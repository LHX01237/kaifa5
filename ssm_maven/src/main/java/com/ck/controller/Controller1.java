package com.ck.controller;

import com.ck.entity.goods;
import com.ck.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.POST;
import java.util.List;
import java.util.Map;

@Controller
public class Controller1 {
    @Autowired
    private GoodsService service;
    @GetMapping("queryAll")
    public String queryAll(Map map){
        List<goods> goods = service.queryAll();
        map.put("All",goods);
        return "1";
    }
}

