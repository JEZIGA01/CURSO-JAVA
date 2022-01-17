import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {
		

		 SimpleDateFormat data = new SimpleDateFormat ("dd/MM/yyyy");
		 SimpleDateFormat data2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		 SimpleDateFormat data3 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		 data3.setTimeZone(TimeZone.getTimeZone("GMT"));
		 
         Date  y = data.parse("17/01/2022");
		 Date y2 = data2.parse("17/01/2022 12:43:06");
		 
		 System.out.println(data.format(y));
		 System.out.println(data2.format(y));
		 System.out.println(data3.format(y2));
		   
		   
	}

 
}
