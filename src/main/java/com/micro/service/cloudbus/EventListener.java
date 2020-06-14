package com.micro.service.cloudbus;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener implements
        ApplicationListener<RemoteEvent> {

    @Override
    public void onApplicationEvent(RemoteEvent event) {
        System.out.println("Received spring custom event - " + event.getMessageType());
    }
}

