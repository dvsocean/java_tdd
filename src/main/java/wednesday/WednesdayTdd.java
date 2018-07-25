package wednesday;

import java.util.ArrayList;
import java.util.Random;

public class WednesdayTdd {

  private ArrayList<String> parkingLot = new ArrayList<String>();

  public ArrayList<String> getParkingLot() {
    return parkingLot;
  }

  public String addCarToLot(String car) {
    parkingLot.add(car);
    if(parkingLot.size() > 100){
      parkingLot.remove(car);
      return "Cannot accept car, lot is full";
    } else {
      return "Successfully added your car. Current count is: " + parkingLot.size();
    }
  }

  public int getLotCapacity() {
    return 100 - parkingLot.size();
  }

  public String deleteCarFromTheLot(String car){
    parkingLot.remove(car);
    return "Have a nice day";
  }

  public int getAvailableSpotCount(){
    return 100 - parkingLot.size();
  }

  public int getAvailableCarCount(){
    int count = 0;
    for(String car: parkingLot){
      if(car != null){
        count++;
      }
    }
    return count;
  }



  public int uniqueIdGenerator(){
    Random r = new Random(100);
    return r.nextInt();
  }
}
