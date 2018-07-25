package wednesday.acquisitiongateway;

public class ShoppingCatalog {


  private Product product;

  public void add(Product product) {
    this.product = product;
  }


  public Product get(int i) {
    return product;
  }
}
