package com.process.mapper;

import com.process.bean.Tracker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AIRobot on 2017/5/12.
 */

@Mapper
public interface TrackerMapper {
    @Select("select * from tracker where trace_id = #{trace_id}")
    Tracker findTrackerByTraceId(@Param("trace_id")Integer trace_id);

    //UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值

}


