import java.util.HashMap;
import java.util.Map;

public class Coordinates {
  //class coordinates
  public String getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  private String x;
  private int y;

  public Coordinates(String x, int y){
    this.x=x;
    this.y=y;
  }
}
