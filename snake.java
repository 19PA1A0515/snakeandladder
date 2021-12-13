import java.util.*;

class Snakes{
  private int noOfSnakes;
  private Map<Integer,Integer> headAndTails = new HashMap<Integer,Integer>();
  public Snakes(int noOfSnakes){
    this.noOfSnakes=noOfSnakes;
  }
  public void addHeadAndTails(int head,int tail){
    headAndTails.put(head,tail);
  }
  public int getNoOfSnakes{
    return noOfSnakes;
  }
  public Map<Integer,Integer> getHeadAndTails{
    return headAndTails;
  }
}
    
