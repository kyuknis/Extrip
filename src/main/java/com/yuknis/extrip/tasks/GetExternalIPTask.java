package com.yuknis.extrip.tasks;

import com.yuknis.extrip.models.IpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GetExternalIPTask {

    public static final Logger logger = LoggerFactory.getLogger(GetExternalIPTask.class);

    @Autowired
    RestTemplate restTemplate;

    @Scheduled(fixedRate = 10000)
    public void getIpFromExternalServer() {
        logger.debug("Running getIpFromExternalServer(...)");
        IpResponse ipResponse = restTemplate.getForObject("https://api.ipify.org?format=json", IpResponse.class);
        logger.info("The IP address received was: " + ipResponse.getIp());
    }

}
