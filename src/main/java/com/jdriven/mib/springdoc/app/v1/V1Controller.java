package com.jdriven.mib.springdoc.app.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class V1Controller {
    @GetMapping("/v1/{id}")
    public ResponseEntity<ActionResponse> getAction(@PathVariable(name = "id") UUID id) {
        return ResponseEntity.ok(new ActionResponse("OK"));
    }

    public record ActionResponse(String action) {
    }
}
