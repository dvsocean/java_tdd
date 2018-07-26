package thursday;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;
import thursday.problemthree.AddressBook;
import thursday.problemthree.User;

public class UserOfAddressBookTests {

  /*
  As a new user of address book, I want to see usage instructions
  so that I can refer	to	instructions	when	I	forget	how	to	use
  the	App.

  As	a	user of	address	book,	I	want	to	hide	private	contact
  details	by	default	so	that	I	can	minimize	chance	of	someone
  else	seeing	them
  */

  private AddressBook addressBook;
  private User user;

  @Before
  public void setUp() {
    addressBook = new AddressBook();
    user = new User();
  }

  @Test
  public void souldDisplayUserInstruction(){
    user.navigateTo("/instructions").confirmPage("instruction page");
    assertEquals(addressBook.getPageTitle(), user.getPageTitle());
  }

  @Test
  public void privateDetailsShouldBeHidden() {
    user.navigateTo("/home").confirmPage("home page");
    assertEquals(addressBook.isPrivateInfoHidden(), user.isPrivateInfoHidden());
  }

  @Test
  public void onlyOneUserShouldBeAbleToBrowseTheApp() {
    user.navigateTo("/home").confirmPage("/home page");
    assertEquals(addressBook.isSingleUser(), user.isSingleUser());
  }
}
