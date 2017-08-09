package com.lovelive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by magpiehoon on 2017. 8. 9..
 */

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "HelloSpring!";
    }
}
