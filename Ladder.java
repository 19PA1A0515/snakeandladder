import java.util.*;

public class Ladders{
  private int noOfLadders;
  private Map<Integer,Integer> startAndEnds = new HashMap<Integer,Integer>();
  public Ladders(int noOfLadders){
    this.noOfLadders = noOfLadders;
  }
  public void addStartAndEmds(int start,int ends){
    startAndEnds.put(start,ends);
  }
  public int getNoOfLadders{
    return noOfLadders;
  }
  public Map<Integer,Integer> getStartAndEnds{
    return startAndEnds;
  }
}
