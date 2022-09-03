package com.zhou.community.service;

import com.zhou.community.dao.AlphaDao;
import org.apache.tomcat.util.modeler.ParameterInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zyh
 * @create 2022-08-03 11:14
 */
@Service
//@Scope("prototype")   //非单例,不常用
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化 AlphaService");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化 AlphaService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁 AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }
}
