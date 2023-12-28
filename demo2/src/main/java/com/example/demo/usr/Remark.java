package com.example.demo.usr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Remark {
    private final Long id;
    private final Long uid;
    private final Long vid;
    private final String remark;

    @Override
    public String toString() {
        return "Remark{" +
                "id=" + id +
                ", uid=" + uid +
                ", vid=" + vid +
                ", remark='" + remark + '\'' +
                '}';
    }
}

