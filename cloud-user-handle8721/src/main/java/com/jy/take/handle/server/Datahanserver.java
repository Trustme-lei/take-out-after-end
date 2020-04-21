package com.jy.take.handle.server;



import com.js.ls.api.entity.CommonResult;

import javax.servlet.http.HttpSession;

/**
 * @author ：雷升
 * @date ：Created in 2020/4/11 22:08
 * @description：数据接口
 * @modified By：
 * @version: 0.1$
 */

public interface Datahanserver {
  /**
   * 登入
   * @param phonemail
   * @param password
   * @return com.jy.take.handle.entity.CommonResult
   * @author 雷升
   * @date 2020/4/15 12:26
  */
  CommonResult login(String phonemail, String password);
}
