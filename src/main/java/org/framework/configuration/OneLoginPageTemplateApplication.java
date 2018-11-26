package org.framework.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="org.framework")
@SpringBootApplication
public class OneLoginPageTemplateApplication extends SpringBootServletInitializer {
		
	public static void main(String[] args) {
		SpringApplication.run(OneLoginPageTemplateApplication.class, args);
	}
}
