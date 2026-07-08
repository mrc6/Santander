import Singleton.SingletonLazy;
import Singleton.SingletonLager;
import Singleton.SingletonLazyHolder;
import Strategy.Comportamento;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.ComportamentoAgressivo;
import Strategy.Robo;

public class Main {

  public static void main(String[] args) {

    // Testes
    // Singleton
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
    
    // Strategy
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();
    
    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    
    robo.setComportamento(defensivo);
    robo.mover();
    
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();
    
    // Facade
  }
}
