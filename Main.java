public class Main {
  public static void main(String[] args) {
    Shop shop = new Shop();
    Product pr1 = new Product("pr1", "pr1", 100);
    Product pr2 = new Product("pr2", "pr2", 100);
    Product pr3 = new Product("pr3", "pr3", 100);
    Product pr4 = new Product("pr4", "pr4", 100);
    Product pr5 = new Product("pr5", "pr5", 100);
    Product pr6 = new Product("pr6", "pr6", 100);
    Product pr7 = new Product("pr7", "pr7", 100);
    shop.addProduct(pr1);
    shop.addProduct(pr2);
    shop.addProduct(pr3);
    shop.addProduct(pr4);
    shop.addProduct(pr5);
    shop.addProduct(pr6);
    shop.addProduct(pr7);

    Buyer buyer1 = new Buyer("buyer1", "buyer1");
    Buyer buyer2 = new Buyer("buyer2", "buyer1");
    Buyer buyer3 = new Buyer("buyer3", "buyer1");
    Buyer buyer4 = new Buyer("buyer4", "buyer1");
    Buyer buyer5 = new Buyer("buyer5", "buyer1");
    Buyer buyer6 = new Buyer("buyer6", "buyer1");
    shop.addBuyer(buyer1);
    shop.addBuyer(buyer2);
    shop.addBuyer(buyer3);
    shop.addBuyer(buyer4);
    shop.addBuyer(buyer5);
    shop.addBuyer(buyer6);
  }
}
