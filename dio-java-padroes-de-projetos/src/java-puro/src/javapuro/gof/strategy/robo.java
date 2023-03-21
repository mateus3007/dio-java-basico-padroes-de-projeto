package javapuro.gof.strategy;

public class robo {
  private comportamento com;

  public void setCom(comportamento com) {
    this.com = com;
  }
 public void mover(){
  com.mover();
 }
}