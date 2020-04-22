package com.js.ls.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：雷升
 * @date ：Created in 2020/4/15 23:47
 * @description：启动类
 * @modified By：
 * @version: 1$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class,args);

  }
}
