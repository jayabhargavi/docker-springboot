package com.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * Hello world!
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class App {
	
	@Autowired
	Environment environment;

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        return "Hello Docker World from :"+ InetAddress.getLoopbackAddress().getHostAddress();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}