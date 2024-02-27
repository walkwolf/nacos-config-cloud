package cn.exev.demo.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author reaper
 */
@RestController
@RefreshScope
public class UserController {
    @Value("${dev.name}")
    private String name;

    @GetMapping("get")
    public String get() {
        System.out.println("name="+name);
        return name;
    }
}
