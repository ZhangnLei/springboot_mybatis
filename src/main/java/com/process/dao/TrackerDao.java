package com.process.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import com.process.bean.Tracker;
/**
 * Created by AIRobot on 2017/5/17.
 */

@Mapper
public interface TrackerDao {

    @Select("SELECT id, first_name AS firstName, last_name AS lastName, birth_date AS birthDate, sex, phone_no AS phoneNo"
            + " FROM test.t_person WHERE id=#{0};")
    public Tracker getTrackerById(int id);

    public int insertTracker(Tracker tracker);

    public int updateTrackerById(Tracker tracker);

 //   public int updatePersonById(Person person);

  //  public int updatePersonByPhoneNo(Person person);


}