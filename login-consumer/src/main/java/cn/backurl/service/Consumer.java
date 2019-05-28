package cn.backurl.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * 微服务消费者
 * </p>
 *
 * @author: akid
 * @create: 2019-05-28 22:24
 **/
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        //引入zkclient依赖，不然报错ZkNoNodeException
        LoginService loginService = context.getBean(LoginService.class);
        System.out.println("consumer");
        System.out.println(loginService.getLoginUser(1L));
    }
}
