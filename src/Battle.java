import javax.sound.midi.SysexMessage;

public class Battle {
  // primary programm
    public static void main(String[] args){

      ModelShip myModel = ModelShip.CARRIER;

      for (ModelShip model : ModelShip.values()) {
        //values est une méthode static sur la classe ModelShip
        System.out.println(model+" de taille "+ model.getLength());
      }

      System.out.println(myModel == ModelShip.CARRIER);
      System.out.println(myModel == ModelShip.DESTROYER);

     }

 // Flotte flotte=new Flotte();
 // Board ship c= new Board(ModelShip.CARRIER, Direction.WEST,Coordinates);
  //Board ship c= new Board(ModelShip.DESTROYER, Direction.EST,Coordinates);
  //Board ship c= new Board(ModelShip.SUBMARINE, Direction.NORTH,Coordinates);
  // Board ship c= new Board(ModelShip.CRUISER, Direction.WEST,Coordinates);
      //
        //flotte.ajouterbateau(s);
        //flotte.coup(2,3);
        //System.out.println(flotte);


}
