package entities;

public class ProductImport extends ProdutoHeran {
  private double customFree;

  public ProductImport(String name, double price, double customFree) {
    super(name, price);
    this.customFree = customFree;
  }

  public double totalPrice() {
    return super.getPrice() * this.customFree / 100;
  }

  public double getCustomFree() {
    return customFree;
  }

  public void setCustomFree(double customFree) {
    this.customFree = customFree;
  }


}
