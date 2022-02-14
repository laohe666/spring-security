package com.laohe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        // 查询数据库 如果不存在 抛出
        if ("admin".equals(username)) {
            throw  new UsernameNotFoundException("用户名不存在");
        }
        // 查询到的密码（注册时已经加密过的密码）解析
        return new User(username,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin,normal"));
    }
}
