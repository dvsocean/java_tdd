package wednesday;

public class OceanSquareMatrix {

  public static void main(String[] args) {

    int[][] myDoubleArray = new int[3][];

    for (int i = 0; i < 3; i++) {
      myDoubleArray[i] = new int[3];
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        myDoubleArray[i][j] = (int) Math.floor(Math.random() * 9);
      }
    }

    //-------------print out multi-dimensional array

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(myDoubleArray[i][j]);
      }
    }
  }

}
