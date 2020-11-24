class Cookie {
  private int number;
  private int temp;
  private int mins;
  private boolean baked;

  Cookie() {
    number = 0;
    temp = 0;
    mins = 0;
    baked = false;
  }

  Cookie(int theNumber, int theTemp, int theMins) {
    number = theNumber;
    temp = theTemp;
    mins = theMins;
    baked = false;
  }

  int getNumber() {
    return number;
  }
  int getTemp() {
    return temp;
  }
  int getMins() {
    return mins;
  }
  boolean getBaked() {
    return baked;
  }

  void setNumber(int theNumber) {
    number = theNumber;
  }
  void setTemp(int theTemp) {
    temp = theTemp;
  }
  void setMins(int theMins) {
    mins = theMins;
  }
  void setBaked(boolean isBaked) {
    baked = isBaked;
  }

  void bake(int theTemp, int theMins) {
    System.out.println(number + " cookies were baked at " + theTemp + " degrees F for " + theMins + " minutes");
    baked = true;
  }
}