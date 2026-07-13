import java.util.Objects;
import java.lang.Object;

public class User{

  private int id;
  
  private String name;
  
  public User(){}
  
  public User(int id, String name){
	this.id = id;
	this.name = name;
  }
  
  public int getId(){
    return this.id;
  }
  
  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return String.format("{'id': %s, 'name': %s}", this.id, this.name);
  }

  @Override
  public boolean equals(final Object obj){
    if((isNull(obj))||(!(obj instanceof User user))) return false;
    if(obj == this) return true;
    return this.id == obj.getId() && Objects.equals(this.name, obj.getName());
  }

  @Override
  public int hashCode(){
    return hash(this.id, this.name);
  }

}
