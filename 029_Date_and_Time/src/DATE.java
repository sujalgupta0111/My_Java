import java.time.LocalDate;
//only use for date purpose
public class DATE {
    public static void main(String... sujal) {
    	LocalDate currentDate = LocalDate.now();
    	LocalDate customDate = LocalDate.of(2010,10,10);
    	System.out.println(currentDate);
    	System.out.println(customDate);
    	
    	System.out.println(customDate.getDayOfMonth());
    	System.out.println(customDate.getDayOfYear());
    	System.out.println(customDate.getMonthValue());

        

        
    }
}
