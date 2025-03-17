package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        log.info("启动完成");


        MyService myService = run.getBean(MyService.class);
        myService.saveUserAndOrder();

        log.info("数据操作完成完成");

        myService.find();

        log.info("数据操作完成完成");
    }

}
