package com.logger.logger_starter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    @GetMapping("/test")
    public String test() {
        logger.info("Info Log");
        logger.warn("Info Warn");
        logger.error("Info Error");
        logger.debug("Info Debug");
        return "Successfully Logged";
    }
}
