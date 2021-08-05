package cn.hp.dao;

import cn.hp.model.HealthInfo;
import cn.hp.model.HealthInfo1;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HealthInfoMapper {
    int selectAccountByPassword(@Param("aname") String aname, @Param("apwd") String apwd);

    List<HealthInfo> selectAll();

    int add(HealthInfo1 healthInfo);

    int delectByUname(String uname);

    HealthInfo1 selcetUname(String uname);

}
