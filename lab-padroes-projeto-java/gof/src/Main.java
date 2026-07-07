
public class Main {

  public static void main(String[] args) {

    // Testes de singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    
    SingletonLager lager = SingletonLager.getInstancia();
    System.out.println(lager);
    
    lager = SingletonLager.getInstancia();
    System.out.println(lager);
    
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    
  }
}
