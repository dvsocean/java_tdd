package tuesday;

import java.util.Scanner;

public class TuesdayTdd {

  public int difference(int arr[][], int n) {
    // Initialize sums of diagonals
    int d1 = 0, d2 = 0;

    for (int i = 0; i < n; i++)
    {
      d1 += arr[i][i];
      d2 += arr[i][n-i-1];
    }

    // Absolute difference of the sums
    // across the diagonals
    return Math.abs(d1 - d2);
  }

  public void rangeOfPrimeNumbers(){
    int s1;
    int s2;
    int flag = 0, i, j;
    Scanner s = new Scanner(System.in);
    System.out.println ("Enter the lower limit :");
    s1 = s.nextInt();

    System.out.println ("Enter the upper limit :");
    s2 = s.nextInt();

    System.out.println ("The prime numbers in between the entered limits are :");
    for(i = s1; i <= s2; i++) {
      for( j = 2; j < i; j++) {
        if(i % j == 0) {
          flag = 0;
          break;
        } else {
          flag = 1;
        }
      }
      if(flag == 1) {
        System.out.println(i);
      }
    }
  }

  /*
  The products of all factors of n

  starting from 2 (because its the first even number), multiply each num
  by the accumulated product until you reach n
   */
  public int factorial(int n) {
    int res = 1;
    for (int i = 2; i<=n; i++) {
      res *= i;
    }
    return res;
  }

  public double series(int n) {
    int i;
    double sums = 0.0, ser;
    for (i = 1; i <= n; ++i) {
      ser = 1 / Math.pow(i, i);
      sums += ser;
    }
    return sums;
  }


  //Check if a string is palindrome
  public void palindromeString(char[] str){
    int l = 0;
    int r = str.length - 1;

    while(r > l){
      if(str[l++] != str[r--]){
        System.out.println("NOT palindrome");
        return;
      }
    }
    System.out.println("PALINDROME!!! PALINDROME!!! PALINDROME!!!");
  }

  //rock paper scissor
  public String rpsGamePlayer1(){
    String[] player1 = new String[]{"Rock", "Paper", "Scissors"};
    return player1[(int) (Math.random() * 3)];
  }

  public String rpsGamePlayer2(){
    String[] player2 = new String[]{"Rock", "Paper", "Scissors"};
    return player2[(int) (Math.random() * 3)];
  }

  private String rpsGame(){
    int draw = 0;

    int pointsForPlayer1 = 0;
    int pointsForPlayer2 = 0;

    for(int i = 0; i <= 2; i++){
      String res1 = rpsGamePlayer1();
      String res2 = rpsGamePlayer2();

      if(res1.equals("Rock") && res2.equals("Scissors")){
        pointsForPlayer1++;
      } else if(res1.equals("Paper") && res2.equals("Scissors")){
        pointsForPlayer2++;
      } else if(res1.equals("Scissors") && res2.equals("Scissors")){
        draw++;
      } else if(res1.equals("Rock") && res2.equals("Paper")){
        pointsForPlayer2++;
      } else if(res1.equals("Paper") && res2.equals("Paper")){
        draw++;
      } else if(res1.equals("Scissors") && res2.equals("Paper")){
        pointsForPlayer1++;
      } else if(res1.equals("Rock") && res2.equals("Rock")){
        draw++;
      } else if(res1.equals("Paper") && res2.equals("Rock")){
        pointsForPlayer1++;
      } else if(res1.equals("Scissors") && res2.equals("Rock")){
        pointsForPlayer2++;
      } else {
        System.out.println("---------------------Un-accounted for condition------------------------");
      }
    }
    return "Player1: " + pointsForPlayer1 + "\nPlayer2: " + pointsForPlayer2 + "\n\n..and " + draw + " draws";
  }

  public String rpsGameWithScores(){
    String results = rpsGame();
    String player1score = results.substring(9, 11);
    String player2score =results.substring(19, 21);
    String draws = results.substring(28, 30);
    return "Player 1 score: " + player1score + "\nPlayer 2 score: " + player2score + "\n..and " + draws + " draws";
  }

  public Scores whoWin(String play1, String play2) {
    if(play1.equals("Rock") && play2.equals("Scissors")){
      return Scores.PlAY1_WIN;
    } else if(play1.equals("Paper") && play2.equals("Scissors")){
      return Scores.PlAY1_LOSE;
    } else if(play1.equals("Scissors") && play2.equals("Scissors")){
      return Scores.DRAW;
    } else if(play1.equals("Rock") && play2.equals("Paper")){
      return Scores.PlAY1_LOSE;
    } else if(play1.equals("Paper") && play2.equals("Paper")){
      return Scores.DRAW;
    } else if(play1.equals("Scissors") && play2.equals("Paper")){
      return Scores.PlAY1_WIN;
    } else if(play1.equals("Rock") && play2.equals("Rock")){
      return Scores.DRAW;
    } else if(play1.equals("Paper") && play2.equals("Rock")){
      return Scores.PlAY1_WIN;
    } else if(play1.equals("Scissors") && play2.equals("Rock")){
      return Scores.PlAY1_LOSE;
    }
    return null;
  }
}
