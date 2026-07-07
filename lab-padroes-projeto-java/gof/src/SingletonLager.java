
//Singleton apressado

public class SingletonLager {

  private static SingletonLager instancia = new SingletonLager();
  
  private SingletonLager() {
    super();	  
  };

  public static SingletonLager getInstancia(){
	  return instancia;
  }
}
