package com.example.demo.usr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Activity {
    private final Long id;
    private final String actname;
    private final String address;
    private final Long   host;
    private final String start_time;
    private final Long vedio;
    private final String text;
    private final Long charge;
    private final String buylink;
    private final Long   havepeople;
    private final Long   totalpeople;
    private final String picture;


}
