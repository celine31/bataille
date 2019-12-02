import javax.sound.midi.SysexMessage;

public class Battle {
    public static void main(String[] args){

      ModelShip myModel = ModelShip.CARRIER;

      for (ModelShip model : ModelShip.values()) {
        System.out.println(model+" de taille "+model.getLength());
      }

      System.out.println(myModel == ModelShip.CARRIER);
      System.out.println(myModel == ModelShip.DESTROYER);

     }
}
