package com.ck.dao;

import com.ck.entity.booktype;
import org.apache.ibatis.annotations.*;

import javax.faces.annotation.RequestMap;
import java.util.List;

public interface BookTypeDao {
    @Select("select*from booktype")

    List<booktype> queryAll();
}
