package org.baeldung.um.run;

import org.baeldung.um.persistence.setup.MyApplicationContextInitializer;
import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmJavaSecurityConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.baeldung.um.spring.UmServletConfig;
import org.baeldung.um.spring.UmWebConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class UmApp extends SpringBootServletInitializer {

    final static Class<?>[] CONFIGS = { // @formatter:off
            UmContextConfig.class,
            UmPersistenceJpaConfig.class,
            UmServiceConfig.class,
            UmWebConfig.class,
            UmServletConfig.class,
            UmJavaSecurityConfig.class
    };// @formatter:on

    //

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.initializers(new MyApplicationContextInitializer()).sources(CONFIGS);
    }

}
