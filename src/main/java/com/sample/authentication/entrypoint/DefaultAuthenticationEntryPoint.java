package com.sample.authentication.entrypoint;

import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

public class DefaultAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
  /**
   * @param loginFormUrl URL where the login page can be found. Should either be
   *                     relative to the web-app context path (include a leading {@code /}) or an absolute
   *                     URL.
   */
  public DefaultAuthenticationEntryPoint(String loginFormUrl) {
    super(loginFormUrl);
  }
}
