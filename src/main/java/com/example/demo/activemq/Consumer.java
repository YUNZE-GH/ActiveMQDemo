package com.example.demo.activemq;

import com.example.demo.entity.Emp;
import com.google.gson.Gson;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 监听器
 * 监听到MQ后调用各方法执行操作
 */
@Component
public class Consumer {

    // 使用JmsListener配置消费者监听的队列，其中message是接收到的消息
    @JmsListener(destination = "ghtest.queue")
    public void receiveQueue(String message) {
        try {
            Emp emp = new Gson().fromJson(message, Emp.class);
            System.out.println("consumer接收到" + emp.getName() + "的电话" + emp.getPhone() + "请求并处理完毕，时间是" + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}