import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);

    Calendar calendar = Calendar.getInstance();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
    System.out.println(formatter.format(calendar.getTime()));

    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter fmtr = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    System.out.println(localDateTime.format(fmtr));
  }
}
