package thursday;

public class Tad {

  //reverse an array
  public String[] reverseAnArray(){
    String[] myArray = new String[]{"Jordana", "Julie", "Allison", "Sara", "Alena"};

    //orig
    for(String s: myArray) {
      System.out.println("Original --> " + s);
    }

    //reversed
    for (int i = 0; i < myArray.length -1; i++) {
      String temp = myArray[i];
      myArray[i] = myArray[myArray.length - i - 1];
      myArray[myArray.length - i - 1] = temp;
    }
    return myArray;
  }

}
