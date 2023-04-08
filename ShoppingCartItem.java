public class ShoppingCartItem {
    Product product;
    int quantity = 0;

    ShoppingCartItem( Product product){
        this.product = product;
    }

    public Product getProduct(){
        return product;
    }
    
    public void addQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }

}
