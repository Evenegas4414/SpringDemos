package org.example.proxies;

import org.example.model.Figura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SmartphoneNotification")
public class SmartphoneCalculoNotificacionProxy implements CalculoNotificacionProxy {

    @Override
    public void enviarFigura(Figura figura) {
        System.out.println("Se ha enviado los calculos de la figura al smartphone.");
        System.out.println("Perimetro: " + figura.calcularPerimetro() + " --- Area: " + figura.calcularArea());
    }
}
