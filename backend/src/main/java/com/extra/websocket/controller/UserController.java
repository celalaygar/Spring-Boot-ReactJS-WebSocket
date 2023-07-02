package com.extra.websocket.controller;

import com.extra.websocket.model.User;
import com.extra.websocket.util.WebSocketUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

import java.util.UUID;

@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @MessageMapping(WebSocketUtil.END_POINT)
    @SendTo("/topic/auction")
    public User send(@Payload User user) {
        user.setSystemNumber(UUID.randomUUID().toString());
        if(StringUtils.isEmpty(user.getSystemNumber())){
            logger.error("user system number is not added");
        }else{
            logger.info("user system number added");
        }
        System.out.println(user);
        return user;
    }
}