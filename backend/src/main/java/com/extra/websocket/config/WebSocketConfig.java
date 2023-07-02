package com.extra.websocket.config;

import com.extra.websocket.util.WebSocketUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker(WebSocketUtil.TOPIC);
        config.setApplicationDestinationPrefixes(WebSocketUtil.DESTINATION_PREFIX);
    }

    // Frontend teknolojilerine veri bu endpointten gelecektir.
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint(WebSocketUtil.END_POINT).setAllowedOriginPatterns("*").withSockJS();
    }
}
