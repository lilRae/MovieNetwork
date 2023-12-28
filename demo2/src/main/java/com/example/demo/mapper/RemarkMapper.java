package com.example.demo.mapper;

import com.example.demo.usr.Remark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RemarkMapper {
    @Select("SELECT * from remarkinfo where vid= #{vid}")
    List<Remark> getRemark(Long vid);
}
