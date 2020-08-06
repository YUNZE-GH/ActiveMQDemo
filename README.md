# ActiveMQDemo
`springBoot` `ActiveMQ`

使用SpringBoot集成ActiveMQ实现消息队列的DEMO

#### 可能遇到异常
  在消费者监听类里使用ObjectMessage对象参数，来接收生产者所发送的信息，可能会发生序列化异常，暂时还不太清楚怎么解决这个序列化和反序列化异常，我的解决方式是将对象转换为json字符传进行传值
