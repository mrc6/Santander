import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main{

  public static void main(String[] args){
    Date date = new Date();
    System.out.println(date);
    
    Calendar calendar = Calendar.getInstance();
    DateFormat formartter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    System.out.println(formartter.format(calendar.getTime()));
  }
}
