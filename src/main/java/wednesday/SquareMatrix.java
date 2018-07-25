package wednesday;

public class SquareMatrix {

  public static void main(String[] args) {
    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    int difference =0;

    int[][] doubleArray = new int[3][];
    for (int i = 0; i < 3; i++) {
      doubleArray[i] = new int[3];
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        doubleArray[i][j] = (int) Math.floor(Math.random()*9);
      }
    }

    //0,0 & 1,1 & 2,2

    // 0,0 | 1,0 | 2,0
    // 0,1 | 1,1 | 2,1
    // 0,2 | 1,2 | 2,2
    
    int sumFirstDiag = 0;
    for (int i = 0; i < doubleArray.length; i++) {
      sumFirstDiag += doubleArray[i][i];
    }

    //0,2 & 1,1 & 2,0
    int sumSecondDiag = 0;
    for (int i = 0; i < doubleArray.length; i++) {
      sumSecondDiag += doubleArray[doubleArray.length-1-i][i];
    }

    difference = Math.abs(sumFirstDiag - sumSecondDiag);


    System.out.println(difference);
  }

}
