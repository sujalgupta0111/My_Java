import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Set;

public class ZonedDATETIME {

	public static void main(String[] args) {
		//yhea UTC universal time corddinated ke basis paar divide hua zore bhi dekhati hai haai
		
		ZonedDateTime currentzdt =  ZonedDateTime.now();
		System.out.println(currentzdt);/* isme  T ke seperator hai time aur date ke becch me  
		nano second ke baad  +5 ka mtb ha utc hai 5 hhr aage aur usme aisa zone represet karta hai */
		
		//esme bhi sare plus minus chal jayenge jo baki classes me chal rahe the 
		// kisi zone ko represent  kiya jata hai zone id se vo zone id hume zoneid class  me milegi
		
	/*	
	Set <String> Zoneids = ZoneId.getAvailableZoneIds();
	Zoneids.forEach(System.out :: println);
		*/
		
		ZonedDateTime customzdt = ZonedDateTime.of(2000, 8, 20, 12, 13, 14, 564000000, ZoneId.of("America/Cuiaba"));
		System.out.println(customzdt);

		
		
	}

}
