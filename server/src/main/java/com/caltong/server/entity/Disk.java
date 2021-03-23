package com.caltong.server.entity;

import java.util.Date;
import lombok.Data;

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