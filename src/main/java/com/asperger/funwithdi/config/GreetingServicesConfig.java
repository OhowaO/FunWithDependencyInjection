package com.asperger.funwithdi.config;

import com.asperger.funwithdi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServicesConfig {

    @Bean
    GreetingRepository createGreetingRepository(){
        return new GreetingRepositoryImpl();
    }

    @Bean
    GreetingServiceFactory createGreetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    GreetingService createDefaultGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createNewGreetingService("default");
    }

    @Bean("i18nService")
    @Profile("EN")
    GreetingService createEnglishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createNewGreetingService("en");
    }

    @Bean("i18nService")
    @Profile("ES")
    GreetingService createSpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createNewGreetingService("es");
    }

    @Bean("i18nService")
    @Profile("DE")
    GreetingService createGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createNewGreetingService("de");
    }
}
