package cl.exql;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanScopeContext.xml");

        Coach theCoach1 = context.getBean("myCoach2", Coach.class);
        Coach theCoach2 = context.getBean("myCoach2", Coach.class);

        System.out.println(theCoach1.equals(theCoach2));

        System.out.println("Location: " + theCoach1);
        System.out.println("Location: " + theCoach2);
    }
}
