package monday;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MondayTddTest {

  private MondayTdd mondayTdd;

  @Before
  public void setUp() throws Exception {
    mondayTdd=new MondayTdd();

  }

  //1 1 2 3 5 8
  //0 1 2 3 4 5

  @Test
  public void fibonacciNumbers() {

    assertEquals(Integer.valueOf(8),mondayTdd.fibonacciNumbers(5));


  }

  @Test
  public void reverseStringByWord() {
  }

  @Test
  public void reverseArrayManually() {

    assertEquals("abcde",mondayTdd.reverseArrayManually("edcba"));
  }

  @Test
  public void acceptSringInputFromConsoleAndReverse() {
  }

  @Test
  public void acceptNumericInputFromConsoleAndReverse() {
  }

  @Test
  public void reverseStringSimpleVersion() {
  }

  @Test
  public void reverseArrayUsingCollections() {
  }

  @Test
  public void manualStringReverse() {
  }

  @Test
  public void reverseStringUsingStringBuilder() {
  }


}