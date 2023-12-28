package com.example.demo.mapper;

import com.example.demo.usr.Vedio;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VedioMapper {
    @Select("SELECT * from vedioinfo")
    List<Vedio> findAll();
    @Select("SELECT count(*) from vedioinfo")
    Integer getSum();
    @Select("INSERT into vedioinfo(id,vedioname,auther,class_name,text,picture,mintext,host,create_time)values" +
            "(#{id},#{vedioname},#{auther},#{class_name},#{text},#{picture},#{mintext},#{host},#{create_time})")
    boolean insert(Vedio vedio);
    boolean update(Vedio vedio);
    @Delete("DELETE  from vedioinfo where id = #{id}")
    int delete(@Param("id") Long id);
    @Select("SELECT * from vedioinfo limit #{pageNum}, #{pageSize}")
    List<Vedio> selectPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);


}

