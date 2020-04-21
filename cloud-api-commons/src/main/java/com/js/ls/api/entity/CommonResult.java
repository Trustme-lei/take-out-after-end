package com.js.ls.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：雷升
 * @date ：Created in 2020/4/16 19:53
 * @description：
 * @modified By：
 * @version: $
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {

  private Integer code;

  private String message;

  private T data;

  public CommonResult(Integer code,String message){
    this(code,message,null);
  }
}