package com.js.ls.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 雷升
 * @date 2020/4/11 20:49
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private long id;
  private String username;
  private String mobile;
  private String password;
  private String email;
  private String gender;
  private long status;
}
