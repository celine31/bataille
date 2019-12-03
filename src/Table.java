import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Table {

   // create table
  public static Map<String, String> do_table() {
    Map<String,String> map =new HashMap<String, String>();
    int i;
    int j;
    ArrayList <String> table=new ArrayList (10);
    table.add("A");
    table.add("B");
    table.add("C");
    table.add("D");
    table.add("E");
    table.add("F");
    table.add("G");
    table.add("H");
    table.add("I");
    table.add("J");

    System.out.println("   A B C D E F G H I J");
    for (i = 0; i < 10; i = i + 1) {
      String val = table.get(i);
      System.out.print(i + 1 + "  ");
      for (j = 1; j < 11; j = j + 1) {
        map.put(val,Integer.toString(j));
        }
      System.out.println();
    }
    return map;
  }
  public static void main(String[] args) {

    do_table();
  }
}
