package com.cloudpayment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloudpayment.mapper")
public class CloudPaymentServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudPaymentServerApplication.class, args);
    }

}
