package com.example.demo.mapper;

import com.example.demo.Controller.dto.UsrDTo;
import com.example.demo.usr.Usr;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
//@Service
public interface UsrMapper {

    @Select("SELECT * from usrinfo")
    List<Usr> findAll();
    @Select("SELECT count(*) from usrinfo")
    Integer getSum();
    @Select("INSERT into usrinfo(id,usrname,password,status)values(#{id},#{usrname},#{password},#{status})")
    boolean insert(Usr usr);
    boolean update(Usr usr);
    @Delete("DELETE  from usrinfo where id = #{id}")
    int delete(@Param("id") Long id);
    @Select("SELECT * from usrinfo limit #{pageNum}, #{pageSize}")
    List<Usr> selectPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);

    @Select("select * from usrinfo where usrname=#{usrname} and password=#{password}")
    Usr login(String usrname, String password);
}
