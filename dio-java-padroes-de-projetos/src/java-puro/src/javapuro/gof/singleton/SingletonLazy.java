package javapuro.gof.singleton;

/* 
 * Singleton "preguiçoso".
 * 
 * @suthor Mateus
*/
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
      super();
    }

      public static SingletonLazy getSingletonLazy(){
        if(instancia == null){
          instancia = new SingletonLazy();
        }
        return instancia;
      }

      
    
}