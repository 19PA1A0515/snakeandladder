import java.util.*;

public class Dice{
  private int noOfDice;
  public Dice(int noOfDice){
    this.noOfDice = noOfDice;
  }
  public int rollADice(){
    return (int)(Math.floor(Math.random()*(6))+1);
  }
}
