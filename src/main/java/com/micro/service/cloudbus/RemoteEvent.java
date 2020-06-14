package com.micro.service.cloudbus;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class RemoteEvent extends RemoteApplicationEvent {

    private static final long serialVersionUID = 4568065173733085381L;

    private String messageType;

    public RemoteEvent() {
    }

    public RemoteEvent(final Object source,
                       final String id,
                       final String messageType) {
        super(source,
                id);
        this.messageType = messageType;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}

enum EventType {
    RESTART,
    LOG;
}