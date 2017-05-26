package com.process.mapper;

import com.process.bean.Test;
import org.apache.ibatis.annotations.*;

/**
 * Created by ZhangLei on 2017/5/24.
 */
@Mapper
public interface TestMapper {
    @Select("select * from test")
    Test findTest();

    @Select("select * from test where id = #{id}")
    Test findTestById(@Param("id")Integer id);

    @Select("select * from test where id = #{id}")
    Test findTestByIdnew(int id);


    @Insert("insert into test(name,password) values(#{name},#{password})")
    int insertTest(Test test);

    @Update("UPDATE test SET name=#{name}, password=#{password} WHERE id=#{id}")
    int updateTestById(Test test);

    @Update("UPDATE test SET name=#{name}, password=#{password} WHERE name=#{name}")
    int updateTestByName(Test test,@Param("name")String name);

    @Delete("DELETE FROM test WHERE id=#{id}")
    int deleteTest(Integer id);

}
