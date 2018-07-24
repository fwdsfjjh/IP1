package org.ipaddress.demo.dao;

import org.ipaddress.demo.pojo.Ip;

public interface IpDao {
    abstract Ip selectIpByIpAdress(String ipAdress);
}
