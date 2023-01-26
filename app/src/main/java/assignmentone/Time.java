package assignmentone;


public class Time {

  public Integer toSeconds(int sec, int min, int hours){
    return sec + (min*60) + ((hours * 60) * 60);
  }

}