package friday;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackQueueTests {

  private Stack stack;

  @Before
  public void setUp() throws Exception {
    stack = new StackIm();
  }

  @Test
  public void shouldBeAbleToPushToStack() throws StackFullException {
    assertTrue(stack.push("Daniel"));
  }

  @Test(expected = StackFullException.class)
  public void shouldGetAnExceptionIfStackIsFull() throws StackFullException {
    for (int i = 0; i <= 10; i++) {
      stack.push("Joe");
    }
  }

  @Test
  public void shouldBeAbleToPopElementFromStack() throws StackFullException, StackEmptyException {
    stack.push("daniel");
    assertTrue(stack.pop() != null);
  }

  @Test
  public void shouldPopTheLastElementThatWasPushed() throws StackFullException, StackEmptyException {
    stack.push("Steve");
    stack.push("Aaron");
    assertTrue(stack.pop().equals("Aaron"));
  }

  @Test(expected = StackEmptyException.class)
  public void shouldNotBeAbleToPopWhenStackEmpty() throws StackFullException, StackEmptyException {
    stack.push("Goitchenburg");
    stack.pop();
    stack.pop();
  }
}
