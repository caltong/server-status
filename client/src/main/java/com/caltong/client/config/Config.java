package com.caltong.client.config;

import entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CPU getCPU() {
        return new CPU();
    }

    @Bean
    public Disk getDisk() {
        return new Disk();
    }

    @Bean
    public Memory getMemory() {
        return new Memory();
    }

    @Bean
    public Name getName() {
        return new Name();
    }

    @Bean
    public Network getNetwork() {
        return new Network();
    }

    @Bean
    public ServerInfo getServerInfo() {
        return new ServerInfo();
    }
}
