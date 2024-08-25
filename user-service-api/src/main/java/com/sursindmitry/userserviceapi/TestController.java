package com.sursindmitry.userserviceapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController.
 * <p>
 * Контроллер для тестирования
 * </p>
 */
@RequestMapping("/api/v1/hello")
public interface TestController {

    @GetMapping
    String helloController();
}
