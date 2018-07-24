package org.ipaddress.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.ipaddress.demo.pojo.Ip;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class IpDaoImp implements IpDao {
    //注入工厂
    private SqlSessionFactory sqlSessionFactory;

    public IpDaoImp(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    //按地域查询
    public Ip selectIpByIpAdress(String ipAdress){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectOne("ip.byIdadress",ipAdress);
    }


}
