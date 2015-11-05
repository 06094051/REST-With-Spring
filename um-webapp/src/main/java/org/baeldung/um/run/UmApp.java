package org.baeldung.um.run;

import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.baeldung.um.spring.UmServletConfig;
import org.baeldung.um.spring.UmWebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class UmApp extends SpringBootServletInitializer {

    private final static Object[] CONFIGS = { UmContextConfig.class, UmPersistenceJpaConfig.class, UmServiceConfig.class, UmWebConfig.class, UmServletConfig.class };

    //

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(CONFIGS);
    }

    public static void main(final String... args) {
        SpringApplication.run(CONFIGS, args);
    }

}
