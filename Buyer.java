import java.util.ArrayList;


public class Buyer {
  
    // Class variables
    private static int buyerID = 0;
    
    // Instance variables
    private int ownID;
    private String firstName;
    private String lastName;
    private ShoppingCart shoppingCart = new ShoppingCart(this);
  
    /**
     * Constructs a Buyer with the specified first and last name.
     * 
     * @param firstName the first name of the buyer
     * @param lastName the last name of the buyer
     */
    public Buyer(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
      ownID = buyerID++;
    }
  
    /**
     * Sets the ID for this buyer.
     * 
     * @param newBuyerID the new buyer ID to set
     * @return true if the ID was set successfully, false if newBuyerID is less than current ID
     */
    public boolean setBuyerID(int newBuyerID) {
      if (newBuyerID < buyerID) {
        return false;
      }
      buyerID = newBuyerID;
      ownID = newBuyerID;
      return true;
    }
  
    /**
     * Gets the current buyer ID.
     * 
     * @return the current buyer ID
     */
    public int getBuyerID() {
      return buyerID;
    }
  
    /**
     * Sets the first name of this buyer.
     * 
     * @param firstName the new first name to set
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
  
    /**
     * Sets the last name of this buyer.
     * 
     * @param lastName the new last name to set
     */
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  
    /**
     * Gets the shopping cart for this buyer.
     * 
     * @return the shopping cart
     */
    public ShoppingCart getCart() {
      return shoppingCart;
    }
  
    /**
     * Adds a product to the shopping cart.
     * 
     * @param product the product to add
     */
    public void addProductToCart(Product product) {
      shoppingCart.addItem(new ShoppingCartItem(product));
    }
  
    /**
     * Gets the shopping cart for this buyer.
     * 
     * @return the shopping cart
     */
    public ShoppingCart getShoppingCart() {
      return shoppingCart;
    }
  
    /**
     * Represents a shopping cart for a buyer.
     */
    public class ShoppingCart {
  
      // Instance variables
      private Buyer owner;
      private ArrayList<ShoppingCartItem> itemses = new ArrayList<>();
  
      /**
       * Constructs a shopping cart with the specified owner.
       * 
       * @param owner the owner of the shopping cart
       */
      public ShoppingCart(Buyer owner) {
        this.owner = owner;
      }
  
      /**
       * Gets the owner of this shopping cart.
       * 
       * @return the owner of the shopping cart
       */
      public Buyer getOwner() {
        return owner;
      }
  
      /**
       * Adds an item to the shopping cart.
       * If the item already exists, increment the quantity by 1, else add the item to the list.
       * 
       * @param item the item to add
       */
      public void addItem(ShoppingCartItem item) {
        for (ShoppingCartItem element : itemses) {
          if (element.getProduct().equals(item.getProduct())) {
            element.addQuantity(1);
            return;
          }
        }
        this.itemses.add(item);
      }
  
      /**
       * Removes an item from the shopping cart.
       * 
       * @param item the item to remove
       * @return true if the item was successfully removed, false otherwise
       */
      public boolean removeItem(ShoppingCartItem item) {
        return itemses.remove(item);
      }
  
      /**
       * Adds a specified amount to the quantity of an item in the shopping cart.
       * 
       * @param item the item to modify
       * @param incrementCountQuantity the amount to add to the quantity
       */
      public void addItemQuantity(ShoppingCartItem item, int incrementCountQuantity) {
        itemses.get(itemses.indexOf(item)).addQuantity(incrementCountQuantity);
      }
  
      /**
       * Calculates the total price of all items in the shopping cart.
       * 
       * @return the total price of all items
       */
      public int getTotalPrice() {
        int res = 0;
        for (ShoppingCartItem shoppingCartItem : itemses) {
          res +=
            shoppingCartItem.getProduct().getPrice() *
            shoppingCartItem.getQuantity();
        }
        return res;
      }
  
      /**
       * Removes all items from the shopping cart.
       */
      public void emptyCart() {
        itemses = new ArrayList<>();
      }
    }
  }