package com.micro.service.cloudbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.SpringCloudBusClient;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudbus")
public class CloudBusController {

    @Autowired
    private SpringCloudBusClient springCloudBusClient;

    @Autowired
    private ApplicationContext applicationContext;


    @GetMapping("/restart")
    public void restart() {
        RemoteEvent remoteEvent = new RemoteEvent(this, applicationContext.getId(), EventType.RESTART.name());
        this.springCloudBusClient.springCloudBusOutput()
                .send(MessageBuilder.withPayload(remoteEvent)
                        .build());

    }
}
