package com.jy.take.handle.mapper;



import com.js.ls.api.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author 雷升
 * @date 2020/4/11 20:49
 */

@Mapper
public interface HandleDao {
  /**
   * 登入
   * @param phonemail
   * @return com.jy.take.handle.entity.User
   * @author 雷升
   * @date 2020/4/15 12:25
  */
  @Select("SELECT * FROM `user` WHERE mobile=#{0} OR email = #{0}")
  User login(String phonemail);
}
