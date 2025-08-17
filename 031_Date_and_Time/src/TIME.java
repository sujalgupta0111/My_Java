import java.time.LocalDate;
import java.time.LocalTime;
//only use for time purpose

public class TIME {
    public static void main(String... sujal) {
    	LocalTime  currenttime = LocalTime.now();
    	//                                    hr,min/sec/ nanosecond
    	LocalTime customtime  = LocalTime.of(10,11,12,20);
    	System.out.println(currenttime);
    	System.out.println(customtime);
    	
    	System.out.println(customtime.getHour());
    	System.out.println(customtime.getMinute());
    	System.out.println(customtime.getSecond());

        

        
    }
}
