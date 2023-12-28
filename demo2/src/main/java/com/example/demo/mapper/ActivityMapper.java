package com.example.demo.mapper;

import com.example.demo.usr.Activity;
import com.example.demo.usr.Usr;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ActivityMapper {
    @Select("SELECT * from activityinfo")
    List<Activity> findAll();
    @Select("SELECT count(*) from activityinfo")
    Integer getSum();
    @Select("INSERT into activityinfo(id,actname,address,host,start_time,vedio,text,charge,buylink,havepeople,totalpeople)values" +
            "(#{id},#{actname},#{address},#{host},#{start_time},#{vedio},#{text},#{charge},#{buylink},#{havepeople},#{totalpeople})")
    void insert(Activity activity);
    boolean update(Activity activity);
    @Delete("DELETE  from activityinfo where id = #{id}")
    int delete(@Param("id") Long id);
    @Select("SELECT * from activityinfo limit #{pageNum}, #{pageSize}")
    List<Activity> selectPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    @Select("SELECT * from activityinfo where vedio= #{vid}")
    List<Activity> getvActivity(Long vid);
    @Update("update  activityinfo  set havepeople= havepeople+1 where id=#{id}")
    boolean addActivity(@Param("id") Long id);
//    @Select("SELECT  * from activityinfo where vedio=#{vid}")
//    List<Activity> findvid( @Param("id") Long vid);
}
