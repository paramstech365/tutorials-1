package org.baeldung.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.baeldung.persistence")
public class PersistenceConfig {

    public PersistenceConfig() {
        super();
    }

}
