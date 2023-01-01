package org.example.services;

import org.example.model.Figura;
import org.example.proxies.CalculoNotificacionProxy;
import org.example.repositories.FiguraRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("FiguraService")
public class FiguraService {

    private final FiguraRepository figuraRepository;
    private final CalculoNotificacionProxy calculoNotificacionProxy;

    public FiguraService( @Qualifier("DBRepository") FiguraRepository figuraRepository,
                          @Qualifier("SmartphoneNotification") CalculoNotificacionProxy calculoNotificacionProxy) {
        this.figuraRepository = figuraRepository;
        this.calculoNotificacionProxy = calculoNotificacionProxy;
    }

    public void mostrarFigura(Figura figura) {
        figuraRepository.almacenarFigura(figura);
        calculoNotificacionProxy.enviarFigura(figura);
    }
}
