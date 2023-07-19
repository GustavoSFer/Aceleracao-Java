package interfaceAndHeranca;

public class Circulo implements IArea {

  private double PI = Math.PI;
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double area() {
    return PI * Math.pow(raio, 2);
  }

}
