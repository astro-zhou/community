package com.zhou.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zyh
 * @create 2022-08-03 10:30
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
