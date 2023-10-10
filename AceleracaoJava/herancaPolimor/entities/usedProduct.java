package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class usedProduct extends ProdutoHeran {

  private LocalDate manufacture;


  public usedProduct(String name, double price, LocalDate manufacture) {
    super(name, price);
    this.manufacture = manufacture;
  }

  public LocalDate getManufacture() {
    return manufacture;
  }


  public void setManufacture(LocalDate manufacture) {
    this.manufacture = manufacture;
  }


  @Override
  public String priceTag() {
    return super.priceTag() + "(Used) $ " + String.format("%.2f", super.getPrice())
        + " (Manufacture date: "
        + this.manufacture.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
  }
}
