package com.ck.dao.impl;

import com.ck.dao.StudentInfoDao;
import com.ck.entity.StudnetInfo;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentInfoDaoImpl implements StudentInfoDao {
    @Override
    public List<StudnetInfo> queryAll() {
        SqlSession session = MybatisUtil.opsession(false);
        StudentInfoDao dao = session.getMapper(StudentInfoDao.class);
        return dao.queryAll();
    }
}
