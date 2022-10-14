package com.zhou.community.util;

import com.zhou.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息,用于代替 session 对象
 *
 * @author zyh
 * @create 2022-09-11 18:54
 */
@Component
public class HostHolder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
