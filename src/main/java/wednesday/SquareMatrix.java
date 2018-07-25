package wednesday;

public class SquareMatrix {

  public static void main(String[] args) {
    //Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    int difference = 0;

    //square matrix programmatically assigned
//    int[][] doubleArray = new int[3][];
//    for (int i = 0; i < 3; i++) {
//      doubleArray[i] = new int[3];
//    }
//
//    for (int i = 0; i < 3; i++) {
//      for (int j = 0; j < 3; j++) {
//        doubleArray[i][j] = (int) Math.floor(Math.random() * 9);
//      }
//    }

    //square matrix manually assigned
    int[][] doubleArray = new int[3][3];
    doubleArray[0][0] = 7;
    doubleArray[1][0] = 24;
    doubleArray[2][0] = 9;
    doubleArray[0][1] = 16;
    doubleArray[1][1] = 25;
    doubleArray[2][1] = 6;
    doubleArray[0][2] = 11;
    doubleArray[1][2] = 4;
    doubleArray[2][2] = 2;

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


