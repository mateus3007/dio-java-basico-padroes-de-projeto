package javapuro.gof;

import javapuro.gof.facade.facade;
import javapuro.gof.singleton.SingletonEager;
import javapuro.gof.singleton.SingletonLazy;
import javapuro.gof.singleton.SingletonLazyHolder;
import javapuro.gof.strategy.comportamento;
import javapuro.gof.strategy.comportamentoagressivo;
import javapuro.gof.strategy.comportamentonormal;
import javapuro.gof.strategy.comportmentodevensivo;
import javapuro.gof.strategy.robo;

public class teste {
  public static void main(String[] args) {

    // singleton

    SingletonLazy lazy = SingletonLazy.getSingletonLazy();
    System.out.println(lazy);
    lazy = SingletonLazy.getSingletonLazy();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getSingletonEager();
    System.out.println(eager);
    eager = SingletonEager.getSingletonEager();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getSingletonLazyHolder();
    System.out.println(holder);
    holder = SingletonLazyHolder.getSingletonLazyHolder();
    System.out.println(holder);

    // strategy

    comportamento normal = new comportamentonormal();
    comportamento defensivo = new comportmentodevensivo();
    comportamento agressivo = new comportamentoagressivo();

    robo RObo = new robo();
    RObo.setCom(normal);
    RObo.mover();
    RObo.mover();
    RObo.setCom(defensivo);
    RObo.mover();
    RObo.mover();
    RObo.setCom(agressivo);
    RObo.mover();
    RObo.mover();
    RObo.mover();

    facade facade = new facade();
		facade.migrarCliente("Mateus", "26262245");

  }
}