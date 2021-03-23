package com.caltong.client.entity;

import lombok.Data;

import java.util.Date;

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