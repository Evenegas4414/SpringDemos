package cl.exql.ssh.ch2ex4;

import cl.exql.ssh.ch2ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean("Fini", Parrot.class);
        System.out.println(p.getName());

        Parrot p2 = context.getBean(Parrot.class);
        System.out.println(p2.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);

    }
}
