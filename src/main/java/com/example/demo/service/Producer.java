package com.example.demo.service;

import com.example.demo.entity.Emp;
import net.sf.json.JSONObject;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * 消息生产者
 * 消息发送到队列
 */
@Service("producer")
public class Producer {
    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    // 发送消息，destination是发送到队列的，message是待发送的消息
    public void sendMessage(String name, String phone) {
        Emp emp = new Emp();
        emp.setPhone(phone);
        emp.setName(name);
        JSONObject json = JSONObject.fromObject(emp);
        Destination destination = new ActiveMQQueue("ghtest.queue");
        // 将消息添加到队列中
        jmsTemplate.convertAndSend(destination, json.toString());
    }
}