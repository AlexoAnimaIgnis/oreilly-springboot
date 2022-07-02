package main.config;

import main.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * We use @Configuration to define that this is a Spring Configuration Class
 * Configuration class is used to define various Spring related configuration for the project.
 * Configuration class is a special class in Spring that we used to instruct Spring to do specific actions
 */
@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    /**
     * @Bean annotation tells the Spring Framework that when it initializes the application context
     * it needs to call this method and add to the context the instance that this method will return.
     * @return
     */
    @Bean("koko")
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
