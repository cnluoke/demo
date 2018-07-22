package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * 关于这个控制器，首先@Controller注解不必多言，
 * say方法上添加的@MessageMapping注解和我们之前使用的@RequestMapping类似。
 * @SendTo注解表示当服务器有消息需要推送的时候，会对订阅了@SendTo中路径的浏览器发送消息。
 */
@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message) {
        System.out.println(message.getName());
        return new ResponseMessage("welcome," + message.getName() + " !");
    }
}