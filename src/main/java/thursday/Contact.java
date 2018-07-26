package thursday;

public class Contact {

  private String name;

  public String getName() {
    return name;
  }

  public Contact(String name){
    this.name = name;
  }

  public void updateUserInfo(String updatedName){
    this.name = updatedName;
  }

  public boolean isUpdated(String name) {
    return this.name.equals(name);
  }
}
