package javapuro.gof.strategy;

public class comportamentoagressivo implements comportamento {

  @Override
  public void mover() {
    System.out.println("movendo-se agressivamente...");

  }

}