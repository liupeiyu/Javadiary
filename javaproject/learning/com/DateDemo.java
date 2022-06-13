//DateDemo.java



import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo{
	public static void main(String[] args) throws ParseException{

	// date->string
	SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月DD日 hh:mm:ss");
	Date date = new Date();
	String time =format.format(date);
	System.out.println(time);
	//string ->date
	String s="2022年06月156日 09:25:32";
	Date  string_to_date=format.parse(s);
	System.out.println(string_to_date);
	}
}