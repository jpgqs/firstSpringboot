package com.eagle.cyg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.eagle.cyg.*"})
@MapperScan("com.eagle.cyg.dao.UserDao")
public class CygApplication {

    public static void main(String[] args) {
        SpringApplication.run(CygApplication.class, args);
    }

}
