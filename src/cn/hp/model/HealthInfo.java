package cn.hp.model;

public class HealthInfo {
    private int hid ;
    private String uname ;
    private String ipcard  ;
    private String temp ;
    private String condition ;
    private String ctime ;
    private int aid ;
    //    新增一个对象 amdin
    private Admin admin ;

    public HealthInfo(int hid, String uname, String ipcard, String temp, String condition, String ctime, int aid,
                      Admin admin) {
        this.hid = hid;
        this.uname = uname;
        this.ipcard = ipcard;
        this.temp = temp;
        this.condition = condition;
        this.ctime = ctime;
        this.aid = aid;
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "HealthInfo{" +
                "hid=" + hid +
                ", uname='" + uname + '\'' +
                ", ipcard='" + ipcard + '\'' +
                ", temp='" + temp + '\'' +
                ", condition='" + condition + '\'' +
                ", ctime='" + ctime + '\'' +
                ", aid=" + aid +
                ", admin=" + admin +
                '}';
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public HealthInfo(int hid, String uname, String ipcard, String temp, String condition, String ctime, int aid) {
        this.hid = hid;
        this.uname = uname;
        this.ipcard = ipcard;
        this.temp = temp;
        this.condition = condition;
        this.ctime = ctime;
        this.aid = aid;
    }

    public HealthInfo() {
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getIpcard() {
        return ipcard;
    }

    public void setIpcard(String ipcard) {
        this.ipcard = ipcard;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
}
