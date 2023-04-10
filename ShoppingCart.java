import java.util.ArrayList;

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
