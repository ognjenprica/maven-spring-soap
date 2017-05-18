package com.javacodegeeks.jaxwsspring.endpoints;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.javacodegeeks.jaxwsspring.services.GreetingService;

@WebService(serviceName="GreetingService")
public class GreetingServiceEndpoint extends SpringBeanAutowiringSupport {

 @Autowired
 private GreetingService greetingService;
 
 @WebMethod
 public String sayHello() {
  return greetingService.sayHello();
 }
 
}