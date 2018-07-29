class Firetruck extends Vehicle implements Resource {

  Firetruck(){super();}
  Firetruck(int speed){super(speed);}

  public String performTask() {
    return drive();
  }
}