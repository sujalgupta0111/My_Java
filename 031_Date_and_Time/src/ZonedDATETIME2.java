import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Set;

public class ZonedDATETIME2 {

	public static void main(String[] args) {
		
		ZonedDateTime india = ZonedDateTime.now();
		ZonedDateTime cuiaba = ZonedDateTime.now(ZoneId.of("America/Cuiaba"));
		
		//System.out.println(india);
		//System.out.println(cuiaba);
		
		String timeformat ="2025-08-12T04:51:26.122525157-04:00[America/Cuiaba]";;
		
		ZonedDateTime parezdt = ZonedDateTime.parse(timeformat);
		System.out.println(parezdt);
		System.out.println(parezdt.getDayOfMonth());
		
	}

}
