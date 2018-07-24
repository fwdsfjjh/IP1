package org.ipaddress.demo.junit;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.ipaddress.demo.dao.IpDao;
import org.ipaddress.demo.dao.IpDaoImp;
import org.ipaddress.demo.pojo.Ip;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
@RestController
public class IpDaoImpTest {
    private SqlSessionFactory sqlSessionFactory;
    @BeforeAll
    public void before()throws Exception{
        String resource = "sqlMapConfig11.xml";
        InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    @RequestMapping(value = "/a",method = RequestMethod.GET)
    public String selectIpByIpAdressTest()
        throws Exception{
        IpDao ipDao = new IpDaoImp(sqlSessionFactory);
        Ip ip = ipDao.selectIpByIpAdress("183.163.40.223");
        System.out.println(ip.getIpAdress());
        System.out.println(ip.getAnonymity());
        return ip.getIpAdress();



    }
}
