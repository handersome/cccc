package cn.hp.service;

import cn.hp.dao.HealthInfoMapper;
import cn.hp.model.HealthInfo;
import cn.hp.model.HealthInfo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthInfoService {
    @Autowired
    private HealthInfoMapper healthInfoMapper;


    public boolean login(String aname, String apwd) {
        int count= healthInfoMapper.selectAccountByPassword(aname,apwd);
        if(count>0){
            return true;
        }
        return false;

    }

    public List<HealthInfo> showAll() {
        return  healthInfoMapper.selectAll();
    }

    public boolean add(HealthInfo1 healthInfo1) {
       int i =  healthInfoMapper.add(healthInfo1);
        if(i>0){
            return true;
        }
        return false;
    }

    public boolean delete(String uname) {
        int i= healthInfoMapper.delectByUname(uname);
        if (i>0){
            return true;
        }
        return false;
    }


    public HealthInfo1 showUname(String uname) {
        return  healthInfoMapper.selcetUname(uname);
    }
}
