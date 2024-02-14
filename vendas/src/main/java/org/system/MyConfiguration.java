package org.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean(name = "applicationName")
    public String ApplicationName(){
        return "Sistema de Vendas";
    }

}
