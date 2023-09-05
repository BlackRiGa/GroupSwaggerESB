package com.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Configuration
public class SwaggerWsEndpointsConfig {

    @Primary
    @Bean
    public SwaggerResourcesProvider swaggerResourcesProvider() {
        return () -> {
            SwaggerResource wsResourceFromWMSLeadBD = new SwaggerResource();
            wsResourceFromWMSLeadBD.setName("ADP.BD.HTTP.FromWMSLeadBD.V1");
            wsResourceFromWMSLeadBD.setSwaggerVersion("3.0");
            wsResourceFromWMSLeadBD.setLocation("/config/ADP.BD.HTTP.FromWMSLeadBD.V1.json");

            SwaggerResource wsResourceFromWMSEvd = new SwaggerResource();
            wsResourceFromWMSEvd.setName("ADP.BD.HTTP.FromWMSEvd.V1");
            wsResourceFromWMSEvd.setSwaggerVersion("3.0");
            wsResourceFromWMSEvd.setLocation("/config/ADP.BD.HTTP.FromWMSEvd.V1.json");

            SwaggerResource wsResourceFromWMSLead = new SwaggerResource();
            wsResourceFromWMSLead.setName("ADP.BD.HTTP.FromWMSLead.V1");
            wsResourceFromWMSLead.setSwaggerVersion("3.0");
            wsResourceFromWMSLead.setLocation("/config/ADP.BD.HTTP.FromWMSLead.V1.json");

            SwaggerResource wsResourceFromWMSAlt = new SwaggerResource();
            wsResourceFromWMSAlt.setName("ADP.BD.HTTP.FromWMSAlt.V1");
            wsResourceFromWMSAlt.setSwaggerVersion("3.0");
            wsResourceFromWMSAlt.setLocation("/config/ADP.BD.HTTP.FromWMSAltV1.json");

            SwaggerResource wsResourceFromWMSGP = new SwaggerResource();
            wsResourceFromWMSGP.setName("ADP.BD.HTTP.FromWMSGP.V1");
            wsResourceFromWMSGP.setSwaggerVersion("3.0");
            wsResourceFromWMSGP.setLocation("/config/ADP.BD.HTTP.FromWMSGP.V1.json");

            List<SwaggerResource> resources = new ArrayList<>();
            resources.add(wsResourceFromWMSLeadBD);
            resources.add(wsResourceFromWMSEvd);
            resources.add(wsResourceFromWMSAlt);
            resources.add(wsResourceFromWMSGP);
            resources.add(wsResourceFromWMSLead);
            return resources;
        };
    }
}
