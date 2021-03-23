package com.caltong.server.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Network {
    private Integer incId;

    private Integer id;

    /**
    * 单位KB每秒
    */
    private Double in;

    /**
    * 单位KB每秒
    */
    private Double out;

    private Date time;
}