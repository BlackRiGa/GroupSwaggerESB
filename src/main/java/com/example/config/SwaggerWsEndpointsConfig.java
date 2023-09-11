package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerWsEndpointsConfig {


    @Primary
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider() {
        return () -> {
            List<SwaggerResource> resources = new ArrayList<>();
            String filePath = "src/main/resources/listAdapters.txt";
            try {
                List<String> lines = Files.readAllLines(Paths.get(filePath));
                lines.forEach(resourceName -> resources.add(loadResource(resourceName)));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return resources;
        };
    }

    private SwaggerResource loadResource(String resource) {
        SwaggerResource wsResource = new SwaggerResource();
        wsResource.setName(resource);
        wsResource.setSwaggerVersion("3.0");
        wsResource.setLocation("/config/" + resource + ".json");
        return wsResource;
    }

}
