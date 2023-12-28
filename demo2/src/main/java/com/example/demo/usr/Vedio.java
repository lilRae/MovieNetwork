package com.example.demo.usr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Vedio {
    private final Long id;
    private final String vedioname;
    private final String auther;
    private final Long class_name;
    private final String text;
    private final String picture;
    private final String mintext;
    private final Long host;
    private final String create_time;
    private final String ename;
    private final String nation;
    private final String ontime;
    private final String editor;
    private final String actors;
    private final String type;
    private final String language;
    private final String length;
    private final Double grade;


}
