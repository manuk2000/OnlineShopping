
/**
  * Represents a product with a unique ID, name, description, price, and stock.
  */
public class Product {

  /**
    * The unique ID of the product.
    */
  private static int productID = 0;

  /**
    * The ID of this particular product instance.
    */
  private int ownID;

  /**
    * The name of the product.
    */
  private String name;

  /**
    * The description of the product.
    */
  private String description;

  /**
    * The price of the product.
    */
  private int price;

  /**
    * The stock of the product.
    */
  private int stock = 0;

  /**
    * Constructs a new product with the given name, description, and price.
    * Generates a new ID for the product.
    *
    * @param name the name of the product
    * @param description the description of the product
    * @param price the price of the product
    */
  Product(String name, String description, int price) {
    this.name = name;
    this.description = description;
    this.price = price;
    ownID = productID++;
  }

  /**
    * Returns the ID of the product.
    *
    * @return the ID of the product
    */
  public int getProductID() {
    return ownID;
  }

  /**
    * Sets the name of the product.
    *
    * @param name the new name of the product
    */
  public void setName(String name) {
    this.name = name;
  }

  /**
    * Sets the description of the product.
    *
    * @param description the new description of the product
    */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
    * Sets the price of the product.
    *
    * @param newPrice the new price of the product
    */
  public void setPrice(int newPrice) {
    price = newPrice;
  }

  /**
    * Returns the price of the product.
    *
    * @return the price of the product
    */
  public int getPrice() {
    return price;
  }

  /**
    * Adds the given count to the current stock of the product.
    *
    * @param addCountStock the count of stock to add
    */
  public void addStock(int addCountStock) {
    stock += addCountStock;
  }

  /**
    * Returns the current stock of the product.
    *
    * @return the current stock of the product
    */
  public int getStock() {
    return stock;
  }
}
