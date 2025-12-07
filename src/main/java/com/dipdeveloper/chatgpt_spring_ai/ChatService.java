package com.dipdeveloper.chatgpt_spring_ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private ChatClient chatClient;

    private ChatService(OpenAiChatModel chatModel){
        this.chatClient = ChatClient.create(chatModel);
    }

    public String ask(String message) {
        return chatClient
                .prompt(message)
                .call()
                .content();
    }
}
