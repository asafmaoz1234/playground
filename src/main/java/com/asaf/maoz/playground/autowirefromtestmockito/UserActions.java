package com.asaf.maoz.playground.autowirefromtestmockito;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActions {

    @Autowired
    private UserRepository userRepository;

    public void addUser(String userName) throws Exception {
        if (StringUtils.isBlank(userName)) {
            throw new Exception("userName is blank");
        }
        UserDAO user = this.userRepository.findByUserName(userName);
    }
}
