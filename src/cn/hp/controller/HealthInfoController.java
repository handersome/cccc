package cn.hp.controller;

import cn.hp.model.HealthInfo;
import cn.hp.model.HealthInfo1;
import cn.hp.service.HealthInfoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class HealthInfoController {
    @Autowired
    private HealthInfoService healthInfoService;

    @RequestMapping("/login")
    public String login(String aname, String apwd) {
                boolean loginFlag = healthInfoService.login(aname, apwd);
                if (loginFlag) {
//            request.getSession().setAttribute("aname", aname);
                    return "forward:success";
                } else {
                    return "forward:index.jsp";

        }
    }
    @RequestMapping("/success")
    public  String success(HttpServletRequest request){
        List<HealthInfo> healthInfos = healthInfoService.showAll();
        request.setAttribute("healthInfos", healthInfos);
        return "success";
    }

    @RequestMapping("/add")
    public  String add(HealthInfo1 healthInfo1) {
        boolean addFlag = healthInfoService.add(healthInfo1);
        if (addFlag) {
            return "forward:success";
        } else {
            return "forward:add.jsp";
        }

    }
    @RequestMapping("/delete")
    public  String delete(String uname){
    boolean deleteFlag = healthInfoService.delete(uname);
    if(deleteFlag){
        return "forward:success";
    }else{
        return "forward:success";
    }
    }
    @RequestMapping("/showUname")
    public String showUname (String uname, HttpServletRequest request){
        HealthInfo1 healthInfo1=healthInfoService.showUname(uname);
        request.setAttribute("healthInfo1",healthInfo1);
        return "update";
    }





}