package com.example.demo.controller;

import com.example.demo.entity.Emp;
import com.example.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaohan
 * @version 1.0
 * @date 2020/8/6 9:46
 */
@RestController
public class TestController {
    @Autowired
    private Producer producer;

    /**
     * 消息队列实现方式
     */
    @RequestMapping("/queue")
    public String queue() {
        for (int i = 0; i < 5; i++) {
            producer.sendMessage("小张" + i, "110119120-" + i);
        }
        return "queue 发送成功";
    }

}
