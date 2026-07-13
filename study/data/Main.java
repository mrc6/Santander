import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);

    Calendar calendar = Calendar.getInstance();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    System.out.println(formatter.format(calendar.getTime()));

    DateTimeFormatter fmtr = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    DateTimeFormatter fmt = DateTimeFormatter.ISO_DATE_TIME; 
    DateTimeFormatter fmtmr = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    LocalDateTime localDateTime = LocalDateTime.now();
    
    System.out.println(localDateTime.format(fmtr));
    System.out.println(localDateTime.format(fmt));
    
    LocalTime localTime = LocalTime.now();
    
    System.out.println(localTime.format(fmtmr));
  }
}
