package org.example.main;

import org.example.configuration.Configuration;
import org.example.model.Rectangulo;
import org.example.services.FiguraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        var context = new AnnotationConfigApplicationContext(Configuration.class);
        var rectangulo = new Rectangulo(5, 6);

        var figuraService = context.getBean(FiguraService.class);

        figuraService.mostrarFigura(rectangulo);

        context.close();

    }
}
