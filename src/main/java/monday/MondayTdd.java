package monday;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MondayTdd {

  public Integer fibonacciNumbers(int input){
    //This is where every third number is the sum of the first two
//    int a = 0;
//    int b = 0;
//    int c = 1;
//
//    for(int i = 1; i < 20; i++){
//      a = b;
//      b = c;
//      c = a + b;
//      System.out.println(a);
//    }

    if (input==0)
      return 1;

    if (input==1)
      return 1;


    return fibonacciNumbers(input-1)+fibonacciNumbers(input-2);

  }
//
//  public void reverseStringByWord(String originalString){
//    //first break string whenever there is a space and stuff into an array
//    String[] oceanArray = originalString.split(" ");
//
//    //show that array
//    for(String s: oceanArray){
//      System.out.println("Original array --> " + s);
//    }
//
//    //then print out array in reverse order
//    for(int i = oceanArray.length -1; i >= 0; i--){
//      System.out.println("\nReveresed --> " + oceanArray[i]);
//    }
//  }
//
  public String reverseArrayManually(String elements){

    //Show original order
//    for(String element: elements){
//      System.out.println("Original order--> " + element);
//    }
//
//    //Re-order the elements
//    for(int i = 0; i < elements.length / 2; i++){
//      String temp = elements[i];
//      elements[i] = elements[elements.length - (1 + i)];
//      elements[elements.length - (1 + i)] = temp;
//    }
//
//    //Print out
//    for (String s: elements){
//      System.out.println("\nReversed order --> " + s);
//    }

    StringBuilder stringBuilder=new StringBuilder();
    stringBuilder.append(elements);


    return stringBuilder.reverse().toString();

  }
//
//  public void acceptSringInputFromConsoleAndReverse(){
//    //Scanner class is responsible for accepting input from user
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Specify the array size");
//
//    int size = sc.nextInt();
//
//    //user sets size of array
//    String[] testArray = new String[size];
//
//    System.out.println("Array size: " + testArray.length);
//    //user gives elements
//    System.out.println("Now, give java the elements");
//    //sc.nextLine();
//    for(int k = 0; k < testArray.length; k++){
//      //quick type check
//      try {
//        testArray[k] = sc.next();
//      } catch (InputMismatchException e) {
//        System.out.println("Only strings are accepted! Start over");
//      }
//    }
//    //print out each element starting from end of array
//    System.out.println("Here is your array..REVERSED");
//    for(int i = testArray.length -1; i >= 0; i--){
//      System.out.println("\n" + testArray[i]);
//    }
//  }
//
//  public void acceptNumericInputFromConsoleAndReverse(){
//    //Scanner class is responsible for accepting input from user
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Specify the array size");
//
//    int size = sc.nextInt();
//
//    //user sets size of array
//    int[] testArray = new int[size];
//
//    System.out.println("Array size: " + testArray.length);
//    //user gives elements
//    System.out.println("Now, give java the elements");
//    //sc.nextLine();
//    for(int k = 0; k < testArray.length; k++){
//      //quick type check
//      try {
//        testArray[k] = sc.nextInt();
//      } catch (InputMismatchException e) {
//        System.out.println("Only numbers are accepted! Start over");
//      }
//    }
//    //print out each element starting from end of array
//    System.out.println("Here is your array..REVERSED");
//    for(int i = testArray.length -1; i >= 0; i--){
//      System.out.println("\n" + testArray[i]);
//    }
//  }
//
//  public void reverseStringSimpleVersion(){
//    String[] arrayList = new String[]{"joe", "John", "Harry", "Steve"};
//    for(String s: arrayList){
//      System.out.println("Original order -->" + s);
//    }
//    //reversed
//    for(int i = arrayList.length -1; i >= 0; i--){
//      System.out.println("\nReversed order --> " + arrayList[i]);
//    }
//  }
//
//  public void reverseArrayUsingCollections(){
//    String[] modeOfTransportation = {"Bentley", "Rolls Royce", "JetPack", "Packed mule"};
//    System.out.println("Before: " + Arrays.toString(modeOfTransportation));
//
//    List<String> reverseThese = Arrays.asList(modeOfTransportation);
//    Collections.reverse(reverseThese);
//    String[] reversed = reverseThese.toArray(modeOfTransportation);
//    System.out.println("Reversed --> " + Arrays.toString(reversed));
//  }
//
//  public String manualStringReverse(String toReverse){
//    String reversed = "";
//    for(int i = toReverse.length() - 1; i >= 0; i--) {
//      reversed = reversed + toReverse.charAt(i);
//    }
//    System.out.println("Original text --> " + toReverse);
//    System.out.println("Reversed --> " + reversed);
//    return reversed;
//  }
//
//  public void reverseStringUsingStringBuilder(){
//    String message = "American airlines is transforming to the cloud.";
//    System.out.println("Original string --> " + message);
//    StringBuilder sb = new StringBuilder(message);
//    System.out.println("Reveresed --> " + sb.reverse().toString());
//  }

}//End of class
