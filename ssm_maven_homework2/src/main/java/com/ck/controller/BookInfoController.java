package com.ck.controller;

import com.ck.entity.bookinfo;
import com.ck.service.BookInfoService;
import com.ck.service.impl.BookInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.UUID;

@Controller
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("adabookinfo")
    @ResponseBody
    public String adabookinfo(MultipartFile file, HttpSession session,bookinfo bi){
        // 获取上传的文件名,如：1.jpg
        String filename = file.getOriginalFilename();
        // 上传文件到upload目录
        // 1、获取upload目录在web项目中的真实路径
        String realPath = session.getServletContext()
                .getRealPath("WEB-INF/upload/");
        // 2、使用UUID为上传文件生成一个唯一的文件名
        filename = filename.replace(
                filename.substring(0, filename.lastIndexOf(".")),
                UUID.randomUUID().toString());
        filename = realPath + filename;
        System.out.println(filename);
        String filenewname = filename;
        try {
            file.transferTo(new File(filename));
            bi.setImgurl(filename);
            bookInfoService.addbookinfo(bi);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "ok";
    }
}
