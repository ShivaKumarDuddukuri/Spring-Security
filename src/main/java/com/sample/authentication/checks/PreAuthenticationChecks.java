package com.sample.authentication.checks;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsChecker;

public class PreAuthenticationChecks implements UserDetailsChecker {

  public void check(UserDetails user) {

  }
}
