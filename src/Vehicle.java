abstract class Vehicle{
  private Integer speed;

  Vehicle(Integer speed){
    this.speed = speed;
  }
  Vehicle(){
    this.speed = 60;
  }
  String drive(){
    return speed.toString();
  }

}
