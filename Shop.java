import java.util.ArrayList;
import java.util.List;

public class Shop {
    private ArrayList<Buyer> buyers = new ArrayList<>();
    private ArrayList<Product> productList = new ArrayList<>();

    public void addBuyer(Buyer buyer){
        buyers.add(buyer);
    }

    public List<Buyer> getBuyerList(){
        return buyers;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public List<Product> getProductList(){
        return productList;
    }
    public void displayProducts(){
        productList.forEach( i -> System.out.println(i));
    }
}