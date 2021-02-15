package com.example.demospringboot.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:/Training/input?=fileName=Test_input.txt")
                .to("file:C:/Training/output/")
                .log(LoggingLevel.INFO, "File transferred successfully");
    }
}
