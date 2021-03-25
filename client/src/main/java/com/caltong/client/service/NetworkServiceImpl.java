package com.caltong.client.service;


import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.NetworkIF;
import sun.management.counter.Units;

import java.util.List;

@Service
public class NetworkServiceImpl implements NetworkService {
    @Override
    public double getIn() {
        List<NetworkIF> networkIFs = new SystemInfo().getHardware().getNetworkIFs();
        double in = 0;
        for (NetworkIF networkIF : networkIFs) {
            in += networkIF.getBytesRecv() / 1024.0;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        networkIFs = new SystemInfo().getHardware().getNetworkIFs();
        double in2 = 0;
        for (NetworkIF networkIF : networkIFs) {
            in2 += networkIF.getBytesRecv() / 1024.0;
        }
        return (in2 - in) / 8;
    }

    @Override
    public double getOut() {
        List<NetworkIF> networkIFs = new SystemInfo().getHardware().getNetworkIFs();
        double out = 0;
        for (NetworkIF networkIF : networkIFs) {
            out += networkIF.getBytesSent() / 1024.0;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        networkIFs = new SystemInfo().getHardware().getNetworkIFs();
        double out2 = 0;
        for (NetworkIF networkIF : networkIFs) {
            out2 += networkIF.getBytesSent() / 1024.0;
        }
        return (out2 - out) / 8;
    }
}
