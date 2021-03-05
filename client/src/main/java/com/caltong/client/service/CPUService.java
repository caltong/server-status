package com.caltong.client.service;

public interface CPUService {
    double getCurrentLoad();

    double getAverageLoad1();

    double getAverageLoad5();

    double getAverageLoad15();

    double getCurrentTemperature();

}
