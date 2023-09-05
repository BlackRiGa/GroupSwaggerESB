package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


    @Bean
    WebMvcConfigurer configurer () {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers (ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/config/ADP.BD.HTTP.FromWMSLeadBD.V1.json").
                        addResourceLocations("classpath:/config");
                registry.addResourceHandler("/config/ADP.BD.HTTP.FromWMSEvd.V1.json").
                        addResourceLocations("classpath:/config");
                registry.addResourceHandler("/config/ADP.BD.HTTP.FromWMSLead.V1.json").
                        addResourceLocations("classpath:/config");
                registry.addResourceHandler("/config/ADP.BD.HTTP.FromWMSAltV1.json").
                        addResourceLocations("classpath:/config");
                registry.addResourceHandler("/config/ADP.BD.HTTP.FromWMSLeadGP.V1.json").
                        addResourceLocations("classpath:/config");
            }
        };
    }
}
