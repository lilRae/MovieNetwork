package com.example.demo.usr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Usr {
    private final Long id;
    private final String usrname;
    private final String password;
    private final int status;
    private final String phone;
    private final String crate_time;
    private final String nickname;


    @Override
    public String toString() {
        return "Usr{" +
                "id=" + id +
                ", status=" + status +
                ", username='" + usrname + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", crate_time='" + crate_time + '\'' +
                '}';
    }
}

