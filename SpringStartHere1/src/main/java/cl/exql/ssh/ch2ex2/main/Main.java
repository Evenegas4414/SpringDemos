package cl.exql.ssh.ch2ex2.main;

import cl.exql.ssh.ch2ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

        Parrot p = context.getBean("parrot4", Parrot.class);
        System.out.println(p.getName());

    }
}
