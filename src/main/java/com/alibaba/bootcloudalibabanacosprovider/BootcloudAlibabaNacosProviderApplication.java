package com.alibaba.bootcloudalibabanacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.service"})
public class BootcloudAlibabaNacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootcloudAlibabaNacosProviderApplication.class, args);
    }

}
