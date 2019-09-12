package com.draper;

import com.draper.service.EchoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author draper_hxy
 */
@Slf4j
@SpringBootApplication
public class EchoClientApplication {

    @Reference(url = "dubbo://127.0.0.1:12345")
    private EchoService echoService;

    public static void main(String[] args) {
        SpringApplication.run(EchoClientApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> log.info(echoService.echo("hello"));
    }

}
