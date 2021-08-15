package entity;

import lombok.Data;

import java.util.Date;

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