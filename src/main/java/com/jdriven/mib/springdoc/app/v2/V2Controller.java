package com.jdriven.mib.springdoc.app.v2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class V2Controller {
    @GetMapping("/v2/{id}")
    public ResponseEntity<ActionResponse> getAction(@PathVariable(name = "id") UUID id) {
        return ResponseEntity.ok(new ActionResponse(true));
    }

    public record ActionResponse(Boolean action) { // <-- version 2 it is a boolean
    }
}
