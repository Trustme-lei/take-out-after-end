package com.jy.take.handle.conteroller;


import com.js.ls.api.entity.CommonResult;
import com.jy.take.handle.server.Datahanserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 雷升
 * @date 2020/4/11 20:51
 */
@RequestMapping("/handle")
@RestController
public class Handleconteroller {

  /**
   * 自动注入
   */
  @Autowired
  private Datahanserver dahser;

  @PostMapping("/login")
  public CommonResult login(String phonemail, String password){
    return dahser.login(phonemail,password);
  }
  @GetMapping("/testA")
  public String testA() {
    return "------testA";
  }
}
