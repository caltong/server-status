package com.caltong.server.entity;

import lombok.Data;
import lombok.ToString;

@Data
public class ServerInfo {
    private Name name;
    private CPU cpu;
    private Memory memory;
}
