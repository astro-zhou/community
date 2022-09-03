package com.zhou.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author zyh
 * @create 2022-08-03 10:46
 */
@Repository
@Primary    //更高的优先级
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
