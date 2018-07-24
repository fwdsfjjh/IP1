package org.ipaddress.demo.pojo;



import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ip {
//    存储ip地址的数据表
    private long ip;//代理主键
    private String ipAdress;//代理IP地址
    private String ipPort;//代理IP端口
    private Data createTime;//该IP地址被插入数据库里面的时间
    private String type_name;//代理的类型，默认为HTTP代理
    private String anonymity;//IP的代理透明度，透明、低匿名，高匿名
    private String location;//代理服务器的位置
    private boolean enable;//该ip地址是否还可用，0：不可用，1：可用
    private long usedSuccess;//该代理IP地址被成功使用过的次数，可以用来评价该代理IP地址的稳定性
    private String responseSpeed;//校验时该IP的响应速度，单位为秒，供参考IP性能
    private int checkTimes;//该代理IP地址被校验的次数
    private Data lastCheckTime;//上一次校验的时间，用于对IP地址的校验

    public Ip(long ip, String ipAdress, String ipPort, Data createTime, String type_name, String anonymity, String location, boolean enable, long usedSuccess, String responseSpeed, int checkTimes, Data lastCheckTime) {
        this.ip = ip;
        this.ipAdress = ipAdress;
        this.ipPort = ipPort;
        this.createTime = createTime;
        this.type_name = type_name;
        this.anonymity = anonymity;
        this.location = location;
        this.enable = enable;
        this.usedSuccess = usedSuccess;
        this.responseSpeed = responseSpeed;
        this.checkTimes = checkTimes;
        this.lastCheckTime = lastCheckTime;
    }

    public Ip() {
    }

    public long getIp() {
        return ip;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public String getIpPort() {
        return ipPort;
    }

    public String getCreateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }

    public String getType_name() {
        return type_name;
    }

    public String getAnonymity() {
        return anonymity;
    }

    public String getLocation() {
        return location;
    }

    public boolean isEnable() {
        return enable;
    }

    public long getUsedSuccess() {
        return usedSuccess;
    }

    public String getResponseSpeed() {
        return responseSpeed;
    }

    public int getCheckTimes() {
        return checkTimes;
    }

    public String getLastCheckTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }

    public void setIp(long ip) {
        this.ip = ip;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public void setAnonymity(String anonymity) {
        this.anonymity = anonymity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setUsedSuccess(long usedSuccess) {
        this.usedSuccess = usedSuccess;
    }

    public void setResponseSpeed(String responseSpeed) {
        this.responseSpeed = responseSpeed;
    }

    public void setCheckTimes(int checkTimes) {
        this.checkTimes = checkTimes;
    }

    public void setLastCheckTime(Data lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
    }
}
