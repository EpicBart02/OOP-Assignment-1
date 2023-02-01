package assignmentone;

/**
 * This is the solution for the Time task.
 */

public class Time {

  /**
   * I return an integer with all the variables turned into seconds. 
   */

  public Integer toSeconds(int hours, int min, int sec) {
    return sec + (min * 60) + ((hours * 60) * 60);
  }

}