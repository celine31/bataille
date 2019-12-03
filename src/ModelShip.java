public enum ModelShip {
  // enum for ship type with features

  CARRIER(5),
  SUBMARINE(2),
  DESTROYER(3),
  CRUISER(4);

  public int getLength() {
    return this.length;
  }

  private final int length;

  ModelShip(int length){
    this.length=length;
  }
}
