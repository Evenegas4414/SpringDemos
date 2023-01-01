package org.example.proxies;

import org.example.model.Figura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EmailNotification")
public class EmailCalculoNotificacionProxy implements CalculoNotificacionProxy {

    @Override
    public void enviarFigura(Figura figura) {
        System.out.println("Se ha enviado los calculos de la figura al correo.");
        System.out.println("Perimetro: " + figura.calcularPerimetro() + " --- Area: " + figura.calcularArea());
    }
}
