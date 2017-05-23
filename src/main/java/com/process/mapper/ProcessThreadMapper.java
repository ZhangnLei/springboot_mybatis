package com.process.mapper;

import com.process.bean.ProcessThread;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by AIRobot on 2017/5/12.
 */

@Mapper
public interface ProcessThreadMapper {
    @Select("select * from process_thread where thread_id = #{thread_id}")
    ProcessThread findProcessThreadByThread_Id(@Param("thread_id")Integer thread_id);


}
