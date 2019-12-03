public class Table {

   // create table
  public static void do_table() {
    int i;
    int j;
    System.out.println("   A B C D E F G H I J");
    for (i = 0; i < 10; i = i + 1) {
      System.out.print(i + 1 + "  ");
      for (j = 1; j < 11; j = j + 1) {
        System.out.print("~ ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {

    do_table();
  }
}
