package org.example.repositories;

import org.example.model.Figura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("JSONRepository")
public class JSONFiguraRepository implements FiguraRepository {

    @Override
    public void almacenarFigura(Figura figura) {
        System.out.println("Figura almacenada en documento json.");
        System.out.println("Perimetro: " + figura.calcularPerimetro() + " --- Area: " + figura.calcularArea());
    }
}
