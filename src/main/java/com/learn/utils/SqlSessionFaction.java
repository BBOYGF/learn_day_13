package com.learn.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFaction {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            String resource = "SqlMapConfig.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            System.out.println("执行成功了！");
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static SqlSession getSqlSessionFactory()
    {
        return sqlSessionFactory.openSession();
    }

}
