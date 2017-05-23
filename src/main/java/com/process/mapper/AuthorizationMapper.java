package com.process.mapper;

import com.process.bean.Authorization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AIRobot on 2017/5/12.
 */
@Mapper
public interface AuthorizationMapper {
    @Select("select * from authorization where auth_id = #{auth_id}")
    Authorization findAuthorizationByAuthId(@Param("auth_id")Integer auth_id);

}
