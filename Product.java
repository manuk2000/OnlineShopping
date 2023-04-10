public class Product {

  private static int productID = 0;
  private int ownID;
  private String name;
  private String description;
  private int price;
  private int stock = 0;

  Product(String name, String description, int price) {
    this.name = name;
    this.description = description;
    this.price = price;
    ownID = productID++;
  }

  public int getProductID() {
    return ownID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(int newPrice) {
    price = newPrice;
  }

  public int getPrice() {
    return price;
  }

  public void addStock(int addCountStock) {
    stock += addCountStock;
  }

  public int getStock() {
    return stock;
  }
}
