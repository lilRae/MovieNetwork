package com.example.demo.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class UsrDTo {
    private  String usrname;
    private  String password;
    private  String nickname;
}
