package com.ck.dao;

import com.ck.entity.StudnetInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentInfoDao {
    @Select("select*from studentinfo")
    public List<StudnetInfo> queryAll();
}
