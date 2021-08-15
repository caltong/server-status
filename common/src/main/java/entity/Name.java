package entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Name {
    private Integer id;

    @Value("${server.name}")
    private String name;
}