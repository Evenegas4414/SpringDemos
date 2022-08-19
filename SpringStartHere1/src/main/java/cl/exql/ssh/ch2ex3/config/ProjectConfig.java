package cl.exql.ssh.ch2ex3.config;

import cl.exql.ssh.ch2ex3.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

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
