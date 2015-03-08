package de.egga.configuration;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author egga
 */
@ComponentScan(basePackages = "de.egga")
@EnableAutoConfiguration
@EnableSwagger
public class MainConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainConfiguration.class, args);
    }
}
