public class Bullhorn implements Resource {
  private Integer decibels;

  Bullhorn(){
    this.decibels = 100000000;
  }


  @Override
  public String performTask() {
    return "LOUD NOISE COMING AT DECIBEL: "+ decibels;
  }
}
