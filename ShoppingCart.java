/**
 * ShoppingCart class represents the user's shopping cart which contains a list of shopping cart items.
 * It has the functionality of adding, removing, and modifying the quantity of items in the cart.
 */
import java.util.ArrayList;

public class ShoppingCart {

  private Buyer owner;
  private ArrayList<ShoppingCartItem> items = new ArrayList<>();

  /**
   * Construct a new shopping cart object with the given owner.
   * @param owner The buyer that owns the shopping cart
   */
  public ShoppingCart(Buyer owner) {
    this.owner = owner;
  }

  /**
   * Get the owner of the shopping cart.
   * @return The buyer that owns the shopping cart
   */
  public Buyer getOwner() {
    return owner;
  }

  /**
   * Add an item to the shopping cart.
   * If the item with the same product is already exist, increment the quantity of the existing item.
   * @param item The item to be added to the cart
   */
  public void addItem(ShoppingCartItem item) {
    for (ShoppingCartItem element : items) {
      if (element.getProduct().equals(item.getProduct())) {
        element.addQuantity(1);
        return;
      }
    }
    this.items.add(item);
  }

  /**
   * Remove an item from the shopping cart.
   * @param item The item to be removed from the cart
   * @return true if the item is successfully removed, false otherwise
   */
  public boolean removeItem(ShoppingCartItem item) {
    return items.remove(item);
  }

  /**
   * Modify the quantity of a specific item in the cart.
   * @param item The item whose quantity needs to be modified
   * @param incrementCountQuantity The amount to increment the item's current quantity by
   */
  public void addItemQuantity(
    ShoppingCartItem item,
    int incrementCountQuantity
  ) {
    items.get(items.indexOf(item)).addQuantity(incrementCountQuantity);
  }

  /**
   * Get the total price of all items in the cart.
   * @return The total price
   */
  public int getTotalPrice() {
    int res = 0;
    for (ShoppingCartItem shoppingCartItem : items) {
      res +=
        shoppingCartItem.getProduct().getPrice() * shoppingCartItem.getQuantity();
    }
    return res;
  }

  /**
   * Empty the shopping cart.
   */
  public void emptyCart() {
    items = new ArrayList<>();
  }
}