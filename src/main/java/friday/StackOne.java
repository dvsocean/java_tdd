package friday;

public class StackOne {

  /*
   * A Queue is a First-in-first-out (FIFO) data structure.
   * If you push item A, B and C in that order, then pop three
   * times, you will get A, B and C. Conversely, a stack is a
   * Last-in-first-out (LIFO) structure; In the same example you
   * would get C, B then A.
   * */

  private String[] stack;
  int size;
  int topOfStack = -1;

  public StackOne(int size){
    this.size = size;
    stack = new String[size];
  }

  public String push(String input){
    if(topOfStack + 1 < stack.length){
      topOfStack++;
      stack[topOfStack] = input;
    }
    return "Added to stack: " + input;
  }

  public String[] getStackContents(){
    return stack;
  }

  public String pop(){
    if(topOfStack >= 0){
      stack[topOfStack] = null;
      return stack[topOfStack];
    }
    return null;
  }









}
