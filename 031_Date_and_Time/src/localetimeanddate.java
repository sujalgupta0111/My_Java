import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
//only use for time purpose

public class localetimeanddate {
    public static void main(String... sujal) {
    	LocalDateTime  currentdt = LocalDateTime.now();
    	//                                    year/month/date/hr/
    	LocalDateTime customdt  = LocalDateTime.of(2010,Month.DECEMBER,12,13,14);
    	System.out.println(currentdt);
    	System.out.println(customdt);
    	
    	System.out.println(customdt.getHour());
    	System.out.println(customdt.getMinute());
    	System.out.println(customdt.getSecond());
    	System.out.println(customdt.getMonthValue());
    	 int i  = customdt.getDayOfYear();
    	 LocalDateTime b = customdt.plusHours(240);
    	 System.out.println(b);
    	
    	

        

        
    }
}
