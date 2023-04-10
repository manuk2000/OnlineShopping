/**
 * This class represents an item in a shopping cart.
 */
public class ShoppingCartItem {

    /**
     * The product associated with this shopping cart item.
     */
    Product product;
    
    /**
     * The quantity of the product in this shopping cart item.
     */
    int quantity = 0;
  
    /**
     * Constructs a new shopping cart item with the given product.
     *
     * @param product The product to associate with this shopping cart item.
     */
    ShoppingCartItem(Product product) {
      this.product = product;
    }
  
    /**
     * Returns the product associated with this shopping cart item.
     *
     * @return The product associated with this shopping cart item.
     */
    public Product getProduct() {
      return product;
    }
  
    /**
     * Sets the quantity of the product in this shopping cart item.
     *
     * @param quantity The new quantity of the product.
     */
    public void addQuantity(int quantity) {
      this.quantity = quantity;
    }
  
    /**
     * Returns the quantity of the product in this shopping cart item.
     *
     * @return The quantity of the product in this shopping cart item.
     */
    public int getQuantity() {
      return quantity;
    }
  }