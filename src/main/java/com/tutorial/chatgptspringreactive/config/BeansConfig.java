package com.tutorial.chatgptspringreactive.config;

import com.tutorial.chatgptspringreactive.service.GPTChatService;
import org.mvnsearch.chatgpt.spring.client.ChatGPTServiceProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public GPTChatService gptChatService(ChatGPTServiceProxyFactory proxyFactory) {
        return proxyFactory.createClient(GPTChatService.class);
    }
}
