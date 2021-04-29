package com.mytiki.biz_act.features.latest.example;

import com.mytiki.biz_act.utilities.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(ExampleConfig.PACKAGE_PATH)
@EntityScan(ExampleConfig.PACKAGE_PATH)
public class ExampleConfig {
    public static final String PACKAGE_PATH = Constants.PACKAGE_FEATURES_LATEST_DOT_PATH + ".example";

    @Bean
    public ExampleController exampleController(@Autowired ExampleService exampleService){
        return new ExampleController(exampleService);
    }

    @Bean
    public ExampleService exampleService(@Autowired ExampleRepository exampleRepository) {
        return new ExampleService(exampleRepository);
    }
}
