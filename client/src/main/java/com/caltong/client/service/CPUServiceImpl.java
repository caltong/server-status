package com.caltong.client.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

import javax.annotation.Resource;

@Service
public class CPUServiceImpl implements CPUService {


    @Override
    public double getCurrentLoad() {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        long[] prevTicks = processor.getSystemCpuLoadTicks();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long[] ticks = processor.getSystemCpuLoadTicks();
        long nice = ticks[CentralProcessor.TickType.NICE.getIndex()] - prevTicks[CentralProcessor.TickType.NICE.getIndex()];
        long irq = ticks[CentralProcessor.TickType.IRQ.getIndex()] - prevTicks[CentralProcessor.TickType.IRQ.getIndex()];
        long softirq = ticks[CentralProcessor.TickType.SOFTIRQ.getIndex()] - prevTicks[CentralProcessor.TickType.SOFTIRQ.getIndex()];
        long steal = ticks[CentralProcessor.TickType.STEAL.getIndex()] - prevTicks[CentralProcessor.TickType.STEAL.getIndex()];
        long cSys = ticks[CentralProcessor.TickType.SYSTEM.getIndex()] - prevTicks[CentralProcessor.TickType.SYSTEM.getIndex()];
        long user = ticks[CentralProcessor.TickType.USER.getIndex()] - prevTicks[CentralProcessor.TickType.USER.getIndex()];
        long iowait = ticks[CentralProcessor.TickType.IOWAIT.getIndex()] - prevTicks[CentralProcessor.TickType.IOWAIT.getIndex()];
        long idle = ticks[CentralProcessor.TickType.IDLE.getIndex()] - prevTicks[CentralProcessor.TickType.IDLE.getIndex()];
        long totalCpu = user + nice + cSys + idle + iowait + irq + softirq + steal;
        return (1.0 - (idle * 1.0 / totalCpu));
    }

    @Override
    public double getAverageLoad1() {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        double[] systemLoadAverage = processor.getSystemLoadAverage(3);
        return systemLoadAverage[0];
    }

    @Override
    public double getAverageLoad5() {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        double[] systemLoadAverage = processor.getSystemLoadAverage(3);
        return systemLoadAverage[1];
    }

    @Override
    public double getAverageLoad15() {
        SystemInfo systemInfo = new SystemInfo();
        CentralProcessor processor = systemInfo.getHardware().getProcessor();
        double[] systemLoadAverage = processor.getSystemLoadAverage(3);
        return systemLoadAverage[2];
    }

    @Override
    public double getCurrentTemperature() {
        return 0;
    }
}
