import monday.MondayTdd;
import thursday.ThursdayTdd;
import tuesday.TuesdayTdd;

public class LaunchPad {

    private static ThursdayTdd thursday = new ThursdayTdd();

    public static void main(String[] args) {
        String[] res = thursday.reverseMidpointMethod();
        for (String s: res){
            System.out.println(s);
        }
    }
}
