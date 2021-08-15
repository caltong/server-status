package entity;

import lombok.Data;

import java.util.Date;

@Data
public class CPU {
    /**
    * 自增id
    */
    private Integer incId;

    /**
    * 对应name表id
    */
    private Integer id;

    /**
    * 当前cpu占用
    */
    private Double currentLoad;

    /**
    * 1分钟平均占用
    */
    private Double averageLoad1;

    /**
    * 5分钟平均占用
    */
    private Double averageLoad5;

    /**
    * 15分钟平均占用
    */
    private Double averageLoad15;

    /**
    * 当前温度
    */
    private Double currentTemperature;

    /**
    * 数据生成时间
    */
    private Date time;
}