package com.sursindmitry.userservice.controller;

import com.sursindmitry.userserviceapi.TestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * Реализация {@link TestController}.
 */
@RestController
@Slf4j
public class TestControllerImpl implements TestController {

    @Override
    public String helloController() {
        log.debug("Вызов метода helloController");
        return "Я работаю";
    }
}
