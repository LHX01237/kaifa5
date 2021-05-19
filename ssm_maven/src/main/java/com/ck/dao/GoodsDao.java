package com.ck.dao;

import com.ck.entity.goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDao {
    @Select("select*from goods")
    List<goods> queryAll();
}
