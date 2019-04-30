package com.sample.authentication.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MysqlUserDetailsService implements UserDetailsService {
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    return null;
  }
}
