package wednesday.acquisitiongateway;

public class User {

  private int userId;


  public User(String username, int i) {
    this.userId = i;
  }

  public String getUsername() {
    return null;
  }

  public int getId() {
    return this.userId;
  }

  public void navigate(String page) {

  }

  public Page getCurrentPage() {
    return new Page();
  }

  public void bid(Product product) {

    product.setLastBid(this.userId);
  }
}
