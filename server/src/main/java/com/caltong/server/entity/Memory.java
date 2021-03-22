package com.caltong.server.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Memory {
    private Integer incId;

    private Integer id;

    /**
     * 单位MB
     */
    private Integer total;

    /**
     * 单位MB
     */
    private Integer available;

    private Date time;
}