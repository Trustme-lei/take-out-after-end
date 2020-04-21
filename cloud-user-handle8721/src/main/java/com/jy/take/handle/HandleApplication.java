package com.jy.take.handle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 雷升
 * @date 2020/4/11 20:49
 */

@SpringBootApplication
@EnableDiscoveryClient
public class HandleApplication {
  public static void main(String[] args) {
    SpringApplication.run(HandleApplication.class,args);
  }


}
