package friday;

public class StackIm implements Stack {

  private String[] myArray = new String[10];
  int counter = 0;

  public StackIm() {
    counter = 0;
  }

  public boolean push(String element) throws StackFullException {
    if(counter <= 9){
      try {
        myArray[counter] = element;
        counter++;
        return true;
      } catch(IndexOutOfBoundsException e){
        return false;
      }
    }
    else{
      throw new StackFullException();
    }
  }

  public String pop() throws StackEmptyException {
    String poppedElement;
    if(counter != 0){
      try {
        poppedElement = myArray[counter-1];
        myArray[counter-1] = null;
        counter--;
      } catch(Exception e){
        e.printStackTrace();
        return null;
      }
    } else {
      throw new StackEmptyException();
    }
    return poppedElement;
  }
}
