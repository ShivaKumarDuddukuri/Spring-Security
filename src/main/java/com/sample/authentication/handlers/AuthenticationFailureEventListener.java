package com.sample.authentication.handlers;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFailureEventListener implements ApplicationListener<AbstractAuthenticationFailureEvent> {
  public void onApplicationEvent(AbstractAuthenticationFailureEvent event) {

  }
}
