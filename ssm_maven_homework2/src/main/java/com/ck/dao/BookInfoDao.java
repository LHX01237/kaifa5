package com.ck.dao;

import com.ck.entity.bookinfo;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface BookInfoDao {
    @Insert("insert into bookinfo values(null,#{bname},#{price},#{booktype.btid},#{dtime},#{state})")
    void addbookinfo(bookinfo bi);

    List<bookinfo> moresearch();
}
