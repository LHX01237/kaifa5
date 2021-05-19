package com.ck;

import com.ck.dao.impl.StudentInfoDaoImpl;
import com.ck.entity.StudnetInfo;
import com.mysql.cj.Session;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void test1(){
        StudentInfoDaoImpl dao = new StudentInfoDaoImpl();
        List<StudnetInfo> queryAll = dao.queryAll();
        System.out.println(queryAll);
    }
}
