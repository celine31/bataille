import java.util.ArrayList;
import java.util.function.DoubleToIntFunction;

public class Board {
  public ModelShip getModel() {
    return model;
  }

  public void setModel(ModelShip model) {
    this.model = model;
  }

  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  //class board
  private ModelShip model;

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

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
