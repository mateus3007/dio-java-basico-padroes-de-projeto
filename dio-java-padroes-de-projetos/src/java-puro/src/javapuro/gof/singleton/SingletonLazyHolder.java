package javapuro.gof.singleton;

/* 
 * Singleton "Lazy Holder".
 * 
 * @suthor Mateus
*/
public class SingletonLazyHolder {

  private static class instanceHolder {
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
  }

  private SingletonLazyHolder() {
    super();
  }

  public static SingletonLazyHolder getSingletonLazyHolder() {
    return instanceHolder.instancia;
  }

}