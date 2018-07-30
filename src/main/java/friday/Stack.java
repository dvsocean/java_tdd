package friday;

public interface Stack {

  boolean push(String element) throws StackFullException;


  String pop() throws StackEmptyException;
}
