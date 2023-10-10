package entities;

public class ProdutoHeran {
  private String name;
  private double price;

  public ProdutoHeran() {}

  public ProdutoHeran(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }

  public String priceTag() {
    return this.name + " $ " + this.price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


}
