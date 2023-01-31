package assignmentone;


public class Time {

  public Integer toSeconds(int hours, int min, int sec){
    return sec + (min*60) + ((hours * 60) * 60);
  }

}