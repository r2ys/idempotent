package com.it4alla.idempotent.controller;

import com.it4alla.idempotent.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ITyunqing
 */
@Deprecated
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void add(User user) {
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("添加用户成功");
    }
}
