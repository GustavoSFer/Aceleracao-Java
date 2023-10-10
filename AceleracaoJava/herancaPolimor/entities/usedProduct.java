package entities;

import java.util.Date;

public class usedProduct extends ProdutoHeran {
  private Date manufacture;

  public usedProduct(String name, double price, Date manufacture) {
    super(name, price);
    this.manufacture = manufacture;
  }

  public Date getManufatureDate() {
    return manufacture;
  }

  public void setManufatureDate(Date manufatureDate) {
    this.manufacture = manufatureDate;
  }

  @Override
  public String priceTag() {
    return super.getName() + "(Used) $ " + String.format("%.2f", super.getPrice())
        + " (Manufacture date: " + this.manufacture + ")";
  }
}
