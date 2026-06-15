import java.util.*;

public class Main{

  public static void main(String[] args){
    List<User> usersList = new ArrayList<>();
    
    usersList.add(new User(1, "João"));
    usersList.add(new User(2, "Maria"));
    usersList.add(new User(3, "Josê"));
    usersList.add(new User(4, "Claudio"));
    usersList.add(new User(5, "Steffanny"));
    
    System.out.println(usersList);
    System.out.println(usersList.remove(new User(3, "Josẽ")));
    System.out.println(usersList);
  }
}
