import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat day = new SimpleDateFormat("dd");
		SimpleDateFormat month = new SimpleDateFormat("MM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		Date date = new Date();

		MyDate today = new MyDate(day.format(date), month.format(date), Integer.parseInt(year.format(date)));

		System.out.print("Today : ");
		System.out.println(today.print());
	}
}
