package school.sptech;

public class Circulo extends Figura{

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public Double calcularArea() {

        Double area = Math.PI * Math.pow(raio, 2);

        return area;

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
