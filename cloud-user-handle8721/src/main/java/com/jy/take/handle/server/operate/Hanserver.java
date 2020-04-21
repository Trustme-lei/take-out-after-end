package com.jy.take.handle.server.operate;

import com.js.ls.api.entity.CommonResult;
import com.js.ls.api.entity.User;
import com.jy.take.handle.mapper.HandleDao;
import com.jy.take.handle.server.Datahanserver;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/11 22:11
 * @description：继承Datahanserver 做数据操作类
 * @modified By：
 * @version: 0.1$
 */
@Service
public class Hanserver implements Datahanserver {

  /**
   * 把handleDao 自动注入 到这个类
   *
   */
  @Autowired
  private HandleDao handleDao;

  /**
   * 登入
   * @param phonemail
   * @param password
   * @return com.jy.take.handle.entity.CommonResult
   * @author 雷升
   * @date 2020/4/15 12:27
  */
  @Override
  public CommonResult login(String phonemail, String password) {
    /**
     * 调用mapper层方法 返回一个实体类user
     */
    User user = handleDao.login(phonemail);
    if (user!=null){
      if (((User) user).getPassword().equals(password)){
        return new CommonResult(200,"登入成功",null);
      }else{
        return new CommonResult(400,"密码错误",null);
      }
    }else{
      return new CommonResult(400,"账号错误",null);
    }
  }

}
