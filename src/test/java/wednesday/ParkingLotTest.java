package wednesday;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

  private WednesdayTdd wednesday;

  @Before
  public void setup(){
    wednesday = new WednesdayTdd();
  }

  @Test
  public void carsShouldBeAbleToEnterTheLot(){
    wednesday.addCarToLot("Bently");
    assertEquals(99, wednesday.getLotCapacity());
  }

  @Test
  public void lotShouldBeAbleToTrackCars(){
    wednesday.addCarToLot("Toyota");
    wednesday.addCarToLot("Dodge");
    assertEquals(98, wednesday.getLotCapacity());
  }

  @Test
  public void carCountForParkingLotShouldBeControlled(){
    String res = null;
    for(int i = 0; i < 101; i++){
      res = wednesday.addCarToLot("Unique ID: " + wednesday.uniqueIdGenerator());
    }
    assertEquals("Cannot accept car, lot is full", res);
  }

//  @Test
//  public void carCounterShouldNotFallBelowZero(){
//    /*
//    NOT SURE THIS WOULD EVER HAPPEN CANT TEST AN ARRAY
//    FOR A SIZE LESS THAN ZERO EITHER
//     */
//  }

  @Test
  public void lotShouldBeAbleToHoldMaximumAmountOfCars(){
    String res = null;
    for(int i = 1; i <= 100; i++){
      res = wednesday.addCarToLot("Honda");
    }
    System.out.println(res);
    assertEquals(100, wednesday.getAvailableCarCount());
  }

  @Test
  public void carsShouldBeAbleToExitTheLot(){
    wednesday.addCarToLot("Tundra");
    wednesday.addCarToLot("Acura");
    //Remove car from lot
    wednesday.deleteCarFromTheLot("Tundra");
    assertEquals(1, wednesday.getAvailableCarCount());
  }

  @Test
  public void lotShouldHaveCapacityOf100Vehicles(){

  }

  @Test
  public void test2(){

  }
}
