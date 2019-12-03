import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Board {
  //class board
  private ModelShip model;
  private Direction direction;
  private Coordinates coordinates;


  Board(ModelShip model, Direction direction, Coordinates coordinates) {
    this.model = model;
    this.direction = direction;
    this.coordinates = coordinates;
  }

  //TODO
  public void isOnSquare(Coordinates coordinates) {

    throw new UnsupportedOperationException();
  }
  public void isSunk(Board board) {
      if(model.getLength()==0) {
        System.out.println("Coulé");
      }

    throw new UnsupportedOperationException();
  }
  public void shotAtt(Board board, Coordinates coordinates){
      if (board.coordinates == coordinates ){

        System.out.println("touché");
      }
    throw new UnsupportedOperationException();
  }
}
