package thursday;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ThursdayTests {

  private ThursdayTdd thursday;

  @Before
  public void setup(){
    thursday = new ThursdayTdd();
  }


  @Test
  public void addressBookShouldHold100Users(){
    for (int i = 0; i < 100; i++) {
      thursday.addContact("John");
    }
    assertEquals(100, thursday.getAddressBookSize());
  }

  @Test
  public void shouldThrowErrorWhenMoreThan100UsersAreAdded(){
    for (int i = 0; i < 105; i++) {
      thursday.addContact("Henry");
    }
    assertTrue(thursday.isError());
  }

  @Test
  public void shouldBeAbleToAddContact(){
    thursday.addContact("emerson");
    assertEquals(1, thursday.getAddressBookSize());
  }

  @Test
  public void shouldBeAbleToUpdateContactInformation(){
    thursday.addContact("Ronald");
    thursday.addContact("Time");
    Contact user = thursday.getContact(0);
    user.updateUserInfo("McBride");
    assertTrue(user.isUpdated("McBride"));
  }

  @Test
  public void shouldBeAbleToRemoveContact(){
    thursday.addContact("Helen");
    thursday.addContact("Sara");
    thursday.addContact("Julie");
    thursday.removeContact(2);
    assertEquals(2, thursday.getAddressBookSize());
  }

  @Test
  public void shouldBeAbleToFindContact(){
    thursday.addContact("Heather");
    thursday.addContact("Allison");
    thursday.addContact("Viri");
    Contact user = thursday.getContact(1);
    assertEquals("Allison", thursday.displayContact(1).getName());
  }
}
