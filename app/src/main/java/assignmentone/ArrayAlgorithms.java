package assignmentone;

import java.util.Random;

/**
 * Solution for the last task.
 */

public class ArrayAlgorithms {
  
  /**
   * I create a double variable, then with a for loop i add every int inside the array to a single array.
   * Then i just divide the sum with the size of the array.
   */
  public Double average(int[] numbers) {
    double sum  = 0;
    int i;
    int size = numbers.length;
    for (i = 0; i < size; i++) {
      sum += numbers[i];
    }
    return sum / size;
  }
  
  /**
   * I check each item one by one and i grab the highest value along the way.
   */

  public Integer maxValue(int[] max) {
    int theMaxValue = 0;
    int i;
    int size = max.length;
    for (i = 0; i < size; i++) {
      if (theMaxValue < max[i]) {
        theMaxValue = max[i];
      }
    }
    return theMaxValue;
  }
  
  /**
   * I create two for loops, they both run trough the array, but one goes forward while the other one goes back.
   * Then i grab the b or i index with the lowest value.
   */

  public Integer minIndex(int[] min) {
    int theMinIndex = 0;
    int size = min.length - 1;
    for (int i = 0; i < size; i++) {
      for (int b = size; b > 0; b--) {
        if (min[b] < min[i]) {
          theMinIndex = b;
        } else {
          theMinIndex = i;
        }
      }
    }
    return theMinIndex + 1;
  }
  
  /**
   * I create a new array and fill it with the current array starting with the first index.
   * Then lastly, i input the first index of the former array into the last index of the new array.
   */

  public int[] shift(int[] numbers) {
    int i;
    int size = numbers.length;
    int[] num = new int[size];
    for (i = 1; i < size; i++) {
      num[i - 1] = numbers[i];
    }
    num[size - 1] = numbers[0];
    return num;
  }
  
  /**
   * I create a new integer variable and give it a random value between the first and last index of the array.
   * I also store the previous index value in temp, so i can use it later on.
   * I do this until the entire array is filled.
   */

  public int[] shuffle(int[] numbers) {
    Random rand = new Random();
    int size = numbers.length;
    for (int i = 0; i < size; i++) {
      int randomIndex = rand.nextInt(size - 1);
      int temp = numbers[randomIndex];
      numbers[randomIndex] = numbers[i];
      numbers[i] = temp;
    }
    return numbers;
  }
  
}
