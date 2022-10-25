package com.jdriven.mib.springdoc.app.config;

import com.jdriven.mib.springdoc.app.v1.V1Controller;
import com.jdriven.mib.springdoc.app.v2.V2Controller;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

//    @Bean
//    public GroupedOpenApi apis() {
//        return GroupedOpenApi.builder()
//                .group("allAPIs")
//                .packagesToScan(AppApplication.class.getPackageName())
//                .build();
//    }

    @Bean
    public GroupedOpenApi apiV1() {
        return GroupedOpenApi.builder()
                .group("v1")
                .packagesToScan(V1Controller.class.getPackageName())
                .build();
    }

    @Bean
    public GroupedOpenApi apiV2() {
        return GroupedOpenApi.builder()
                .group("v2")
                .packagesToScan(V2Controller.class.getPackageName())
                .build();
    }
}
