package com.tuna.collectionagent.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class CommonController {

    /**
     * Example API
     */
    @GetMapping("/")
    @Operation(summary = "Example API", description = "Example API Description")
    //FIXME
    public String tuna() {
        log.debug("call! tuna api..!");
        return "Hi! Tuna Collector :)";
    }
}
