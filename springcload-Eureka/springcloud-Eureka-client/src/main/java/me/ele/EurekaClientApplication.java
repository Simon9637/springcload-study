package me.ele;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/9/17
 * <p>Copyright: Copyright (c) 2019</p>
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "me.ele.controller")
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
