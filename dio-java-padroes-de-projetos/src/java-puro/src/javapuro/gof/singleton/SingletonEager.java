package javapuro.gof.singleton;

/* 
 * Singleton "apressado".
 * 
 * @suthor Mateus
*/
public class SingletonEager {
    private static SingletonEager instancia =  new SingletonEager();
    private SingletonEager(){
      super();
    }

      public static SingletonEager getSingletonEager(){
       
        return instancia;
      }

      
    
}