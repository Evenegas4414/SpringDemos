package org.example.repositories;

import org.example.model.Figura;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("DBRepository")
public class DBFiguraRepository implements FiguraRepository {

    @Override
    public void almacenarFigura(Figura figura) {
        System.out.println("Figura almacenada en base de datos.");
        System.out.println("Perimetro: " + figura.calcularPerimetro() + " --- Area: " + figura.calcularArea());
    }
}
