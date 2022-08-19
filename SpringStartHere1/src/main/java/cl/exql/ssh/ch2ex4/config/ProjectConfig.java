package cl.exql.ssh.ch2ex4.config;

import cl.exql.ssh.ch2ex4.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Primary
    @Bean(name = "Koko")
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "Fini")
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Fini");
        return p;
    }

    @Bean
    Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Bulu");
        return p;
    }

    @Bean
    Parrot parrot4() {
        Parrot p = new Parrot();
        p.setName("Lele");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
