public enum ModelShip {
  CARRIER(5),
  SUBMARINE(2),
  DESTROYER(3),
  CRUISER(4);

  public int getLength() {
    return length;
  }

  private int length;

  ModelShip(int length){
    this.length=length;
  }


}
