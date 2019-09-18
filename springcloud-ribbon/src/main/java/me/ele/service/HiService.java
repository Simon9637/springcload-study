package me.ele.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: liuhuan
 * @CreateDate: 2019/9/17
 * <p>Copyright: Copyright (c) 2019</p>
 */
@Service
public class HiService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHi(String name) {
        return restTemplate.getForObject("http://eurka-client/hi?name=" + name, String.class);
    }
}
