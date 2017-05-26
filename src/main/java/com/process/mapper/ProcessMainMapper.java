package com.process.mapper;

import com.process.bean.ProcessMain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AIRobot on 2017/5/12.
 */
@Mapper
public interface ProcessMainMapper {
    @Select("select * from process_main where process_main_id = #{process_main_id}")
    ProcessMain findProcessMainByProcessMainId(@Param("process_main_id") Integer process_main_id);

}
