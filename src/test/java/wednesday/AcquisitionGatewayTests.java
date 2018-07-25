package wednesday;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import wednesday.acquisitiongateway.Product;
import wednesday.acquisitiongateway.ShoppingCatalog;
import wednesday.acquisitiongateway.User;

public class AcquisitionGatewayTests {

  private AcquisitionGateway acquisitionGateway;
  private User user;

  private static final String CLOONEY_PASSWORD = "tdlr";
  private ShoppingCatalog shoppingCatalog;


  /*
  As anAcquisition Gateway User, I need
  to select an Auction product in the Acquisition ordering platform
  so thatI can bid on it.Ensure the Acquisition Gateway User is able to:
  •log in to Acquisition Gateway
  •navigate to the Auction page
  •able to select a product(s) to bid on
   */

  @Before
  public void setup() {
    this.acquisitionGateway = new AcquisitionGateway();
    this.user = new User("GeorgeClooney", 12345);
    this.shoppingCatalog = new ShoppingCatalog();
    this.shoppingCatalog.add(new Product("antique1"));
    this.shoppingCatalog.add(new Product("antique2"));
    this.shoppingCatalog.add(new Product("antique3"));
    this.acquisitionGateway.setShoppingCatalog(this.shoppingCatalog);
  }

  @Test
  public void userShouldBeAbleToLogIn() {
    acquisitionGateway.getAuth().login(this.user.getUsername(), CLOONEY_PASSWORD);
    assertTrue(acquisitionGateway.getAuth().isLoggedIn(this.user.getId()));
  }

  @Test
  public void userShouldNavigateToAuctionPage(){
    this.user.navigate("/auction");
    assertEquals("Page", user.getCurrentPage().getPageTitle());
  }

  @Test
  public void userShouldBeAbleToBidOnProducts() {
    this.user.navigate("/auction");
    this.user.bid(this.shoppingCatalog.get(2));
    System.out.println(this.user.getId() + ":" + this.shoppingCatalog.get(2).getLastBid());
    assertEquals(this.user.getId(), this.shoppingCatalog.get(2).getLastBid());
  }

  @Test
  public void userShouldBeAbleToPlaceBidOnExoticProducts(){
    Product product = new Product("Yellow Boa");
    this.shoppingCatalog.add(product);
    this.user.navigate("/auction");
    this.user.bid(product);
    assertEquals(product.getLastBid(), this.user.getId());
  }

  @Test
  public void userShouldHaveCorrectId() {
    User user = new User("Joe", 56);
    assertEquals(user.getId(), 56);
  }

  @Test
  public void userBidShouldSetLastBid() {
    User user = new User("Joe", 56);
    Product product = new Product("Yellow Boa");
    user.bid(product);
    assertEquals(56, product.getLastBid());
  }
}
