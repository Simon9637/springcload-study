package me.ele.controller;

import me.ele.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/9/17
 * <p>Copyright: Copyright (c) 2019</p>
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return hiService.sayHi(name);
    }
}
