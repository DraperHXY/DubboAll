package com.draper.service.impl;


import com.draper.service.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author draper_hxy
 */
@Slf4j
@Service
public class EchoServiceImpl implements EchoService {

    public String echo(String message) {
        log.info("message = {}", message);
        return message;
    }

}
