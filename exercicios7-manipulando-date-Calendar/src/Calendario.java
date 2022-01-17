import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args)throws ParseException {
		 
		SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2022-01-17T13:29:09Z"));
		
		System.out.println(spd.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int mes = 1+ cal.get(Calendar.MONTH);
		 

		System.out.println("Min: "+ minutes);

		System.out.println();

		System.out.println("Mes: "+ mes);
		
		System.out.println(spd.format(d));
	}

}
