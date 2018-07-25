package wednesday;

import java.util.Optional;
import sun.net.ftp.FtpClient;
import wednesday.acquisitiongateway.Authorization;
import wednesday.acquisitiongateway.ShoppingCatalog;

public class AcquisitionGateway {
  /*
  As anAcquisition Gateway User, I need
  to select an Auction product in the Acquisition ordering platform
  so thatI can bid on it.Ensure the Acquisition Gateway User is able to:
  •log in to Acquisition Gateway
  •navigate to the Auction page
  •able to select a product(s) to bid on
   */

  public static void main(String[] args) {

  }

  public Authorization getAuth() {
    return new Authorization();
  }


  public void setShoppingCatalog(ShoppingCatalog shoppingCatalog) {

  }

  public ShoppingCatalog getShoppingCatalog() {
    return new ShoppingCatalog();
  }
}
