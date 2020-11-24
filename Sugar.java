class Sugar extends Cookie {
  private String shape;
  private boolean decorated;

  Sugar() {
    shape = "";
    decorated = false;
  }

  Sugar(String theShape) {
    shape = theShape;
    decorated = false;
  }

  String getShape() {
    return shape;
  }
  boolean getDecorated() {
    return decorated;
  }

  void setShape(String theShape) {
    shape = theShape;
  }
  void setDecorated(boolean isDecorated) {
    decorated = isDecorated;
  }

  void cut(String theShape, int theNumber) {
    System.out.println(theNumber + " cookies were cut into " + theShape);
    setNumber(theNumber);
  }
  void decorate() {
    if (getBaked()) {
      decorated = true;
      System.out.println("The cookies were decorated");
    } else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}