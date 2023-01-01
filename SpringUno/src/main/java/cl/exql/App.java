package cl.exql;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("----------");

        Coach theFootballCoach = context.getBean("myFootballCoach", Coach.class);
        System.out.println(theFootballCoach.getDailyFortune());
        System.out.println(theFootballCoach.getDailyWorkout());

        context.close();

    }
}
