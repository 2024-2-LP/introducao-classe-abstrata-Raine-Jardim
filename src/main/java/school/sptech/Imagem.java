package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura) {

        figuras.add(figura);

    }

    public Double calcularSomaDasAreas() {

        Double totalAreas = 0.0;

        for (Figura figuraDaVez : figuras) {

            totalAreas += figuraDaVez.calcularArea();

        };

        return totalAreas;

    }

    public List<Figura> buscarPorAreaMaiorQue20() {

        List<Figura> listaAreasMaiorVinte = new ArrayList<>();

        for (Figura figuraDaVez : figuras) {

            if (figuraDaVez.calcularArea() > 20) {

                listaAreasMaiorVinte.add(figuraDaVez);

            }

        }

        return listaAreasMaiorVinte;

    }

    public List<Figura> buscarQuadrados() {

        List<Figura> quadrados = new ArrayList<>();

        for (Figura figuraDaVez : figuras) {

            if (figuraDaVez instanceof Quadrado) {

                quadrados.add(figuraDaVez);

            }

        }

        return quadrados;

    }

}
