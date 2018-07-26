package thursday;

import java.util.ArrayList;

public class ThursdayTdd {

  private ArrayList<Contact> addressBook = new ArrayList<Contact>();
  private ErrorValue error;

  public void reverseAnArray(){
    //----------------------------Reversing Arrays----------------------------
    String[] myArray = new String[]{"Joe", "Harris", "Tom", "Steve", "Allen"};

    System.out.println("Original array:");
    for(String s: myArray){
      System.out.println(s);
    }

    for (int i = myArray.length -1; i >= 0; i--) {
      System.out.println("\nReversed --> " + myArray[i]);
    }
  }

  public String[] reverseMidpointMethod(){
    String[] myArray = new String[]{"Joe", "Harris", "Tom", "Steve", "Allen"};

    for (int i = 0; i < myArray.length / 2; i++) {
      String temp = myArray[i];
      myArray[i] = myArray[myArray.length - i - 1];
      myArray[myArray.length - i - 1] = temp;
    }

    return myArray;
  }

  public void addContact(String name) {
    Contact contacts = new Contact(name);
    addressBook.add(contacts);
    if(addressBook.size() > 100){
      error = ErrorValue.TOO_MANY_CONTACTS;
    }
  }

  public int getAddressBookSize() {
    return addressBook.size();
  }

  public Contact getContact(int i) {
    return addressBook.get(i);
  }

  public void removeContact(int id) {
    addressBook.remove(id);
  }

  public Contact displayContact(int i) {
    return addressBook.get(i);
  }

  public boolean isError() {
   return this.error != null;
  }
}

