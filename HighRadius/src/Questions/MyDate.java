package Questions;
import java.util.Date;
//import java.sql.Date;
public class MyDate {

	public static void main(String[] args) {
         long millis=System.currentTimeMillis();  
		Date d=new Date(millis );
		System.out.println(d);

	}

}
