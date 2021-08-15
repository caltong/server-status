package entity;

import lombok.Data;

@Data
public class ServerInfo {
    private Name name;
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    private Network network;
}
