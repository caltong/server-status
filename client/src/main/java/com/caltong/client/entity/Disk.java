package com.caltong.client.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Disk {
    private Integer incId;

    private Integer id;

    /**
    * 单位GB
    */
    private Integer total;

    /**
    * 单位GB
    */
    private Integer available;

    private Date time;
}