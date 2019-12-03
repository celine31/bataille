public class HidingBoard {
//class table of boads

Coordinates coordinates= new Coordinates();

  public void squareState(Coordinates coordinates){
    throw new UnsupportedOperationException();
  }

  public void putShip(Board board){
    Board ship= new Board(ModelShip.CARRIER, Direction.WEST, coordinates);
    Board ship2 = new Board(ModelShip.SUBMARINE, Direction.NORTH,coordinates);
    Board ship3 = new Board(ModelShip.DESTROYER, Direction.SUD,coordinates);
    Board ship4 = new Board(ModelShip.CRUISER, Direction.WEST,coordinates);

    //throw new UnsupportedOperationException();
  }



 // public class Flotte {
   // private ArrayList bateaux;
    /** Creates a new instance of Flotte */
    //public Flotte() {
      //bateaux=new ArrayList();
    //}
    //public void ajouterbateau(Bateau b){
      //if(!bateaux.contains(b))
       // bateaux.add(b);
    //}
    //public void enleverbateau(Bateau b){
      //if(bateaux.contains(b))
        //bateaux.remove(b);
    //}
    //public void coup(int x, int y){
      //for(int i=0;i<bateaux.size();i++)
        //((Bateau)(bateaux.get(i))).touche(x,y);
    //}
  }
  //public void shotAtt(coordinates){
 // if(abcisse==i && ordonnee==j) {
   // if(etat=="intact"){
     // etat="abime";
    //}else if(etat=="abime")
     // etat="detruit";
//}
