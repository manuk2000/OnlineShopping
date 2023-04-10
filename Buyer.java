import java.util.ArrayList;

public class Buyer {
  private static int buyerID = 0;
  private int ownID;
  private String firstName;
  private String lastName;
  private ShoppingCart shoppingCart = new ShoppingCart(this);

  public Buyer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    ownID = buyerID++;
  }

  public boolean setBuyerID(int newBuyerID) {
    if (newBuyerID < buyerID) {
      return false;
    }
    buyerID = newBuyerID;
    ownID = newBuyerID;
    return true;
  }

  public int getBuyerID() {
    return buyerID;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ShoppingCart getCart() {
    return shoppingCart;
  }

  public void addProductToCart(Product product) {
    shoppingCart.addItem(new ShoppingCartItem(product));
  }

  public ShoppingCart getShoppingCart() {
    return shoppingCart;
  }

  public class ShoppingCart {

    private Buyer owner;
    private ArrayList<ShoppingCartItem> itemses = new ArrayList<>();

    public ShoppingCart(Buyer owner) {
      this.owner = owner;
    }

    public Buyer getOwner() {
      return owner;
    }

    public void addItem(ShoppingCartItem item) {
      for (ShoppingCartItem element : itemses) {
        if (element.getProduct().equals(item.getProduct())) {
          element.addQuantity(1);
          return;
        }
      }
      this.itemses.add(item);
    }

    public boolean removeItem(ShoppingCartItem item) {
      return itemses.remove(item);
    }

    public void addItemQuantity(
      ShoppingCartItem item,
      int incrementCountQuantity
    ) {
      itemses.get(itemses.indexOf(item)).addQuantity(incrementCountQuantity);
    }

    public int getTotalPrice() {
      int res = 0;
      for (ShoppingCartItem shoppingCartItem : itemses) {
        res +=
          shoppingCartItem.getProduct().getPrice() *
          shoppingCartItem.getQuantity();
      }
      return res;
    }

    public void emptyCart() {
      itemses = new ArrayList<>();
    }
  }
}
