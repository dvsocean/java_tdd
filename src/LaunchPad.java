import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaunchPad {

    public static void main(String[] args) {
      //call methods here
      reverseStringByWord("Run around town trying to find a job and then God blesses");
    }

    public static void reverseStringByWord(String originalString){
      //first break string whenever there is a space and stuff into an array
      String[] oceanArray = originalString.split(" ");

      //show that array
      for(String s: oceanArray){
        System.out.println("Original array --> " + s);
      }

      //then print out array in reverse order
      for(int i = oceanArray.length -1; i >= 0; i--){
        System.out.println("\nReveresed --> " + oceanArray[i]);
      }
    }

    public static void reverseArrayManually(String [] elements){
      //Show original order
      for(String element: elements){
        System.out.println("Original order--> " + element);
      }

      //Re-order the elements
      for(int i = 0; i < elements.length / 2; i++){
        String temp = elements[i];
        elements[i] = elements[elements.length - (1 + i)];
        elements[elements.length - (1 + i)] = temp;
      }

      //Print out
      for (String s: elements){
        System.out.println("\nReversed order --> " + s);
      }
    }

    public static void acceptNumericInputFromConsoleAndReverse(){
      //Scanner class is responsible for accepting input from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Specify the array size");

      //user sets size of array
      int testArray[] = new int[sc.nextInt()];

      //user gives elements
      System.out.println("Now, give java the elements");
      for(int k = 0; k < testArray.length; k++){
        //quick type check
        if(!sc.hasNextInt()){
          System.out.println("Only numbers are accepted! Start over");
        } else {
          testArray[k] = sc.nextInt();
        }
      }

      //print out each element starting from end of array
      System.out.println("Here is your array..REVERSED");
      for(int i = testArray.length -1; i >= 0; i--){
        System.out.println("\n" + testArray[i]);
      }
    }

    public static void reverseStringSimpleVersion(){
      String[] arrayList = new String[]{"joe", "John", "Harry", "Steve"};
      for(String s: arrayList){
        System.out.println("Original order -->" + s);
      }
      //reversed
      for(int i = arrayList.length -1; i >= 0; i--){
        System.out.println("\nReversed order --> " + arrayList[i]);
      }
    }

    public static void reverseArrayUsingCollections(){
      String[] modeOfTransportation = {"Bentley", "Rolls Royce", "JetPack", "Packed mule"};
      System.out.println("Before: " + Arrays.toString(modeOfTransportation));

      List<String> reverseThese = Arrays.asList(modeOfTransportation);
      Collections.reverse(reverseThese);
      String[] reversed = reverseThese.toArray(modeOfTransportation);
      System.out.println("Reversed --> " + Arrays.toString(reversed));
    }

    public static void manualStringReverse(){
      String toReverse = "Hello my ninja, reverse me please";
      String reversed = "";
      for(int i = toReverse.length() - 1; i >= 0; i--) {
        reversed = reversed + toReverse.charAt(i);
      }
      System.out.println("Original text --> " + toReverse);
      System.out.println("Reversed --> " + reversed);
    }

    public static void reverseStringUsingStringBuilder(){
      String message = "American airlines is transforming to the cloud.";
      System.out.println("Original string --> " + message);
      StringBuilder sb = new StringBuilder(message);
      System.out.println("Reveresed --> " + sb.reverse().toString());
    }

}
