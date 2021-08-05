package cn.hp.model;

public class Admin {
    private int aid;
    private String aname;
    private  String apwd;
    private  String realname;

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apwd='" + apwd + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Admin() {
    }

    public Admin(int aid, String aname, String apwd, String realname) {
        this.aid = aid;
        this.aname = aname;
        this.apwd = apwd;
        this.realname = realname;
    }
}
