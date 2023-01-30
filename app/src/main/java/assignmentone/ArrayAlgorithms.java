package assignmentone;

import java.util.Random;

public class ArrayAlgorithms {
    
    
    public Double average(int[] numbers){
        double sum  = 0;
        int i;
        int size = numbers.length;
        for(i = 0; i < size; i++){
          sum += numbers[i];
        }
        return sum / size;
      }
    
      public Integer maxValue(int[] max){
        int theMaxValue = 0;
        int i;
        int size = max.length;
        for(i = 0; i < size; i++){
          if(theMaxValue < max[i]){
            theMaxValue = max[i];
          }
        }
        return theMaxValue;
      }
    
    
      public Integer minIndex(int[] min){
        int theMinIndex = min[1];
        int i;
        int size = min.length;
        for(i = 0; i<size; i++){
          if(theMinIndex > min[i]){
            theMinIndex = min[i];
          }
        }
        return theMinIndex;
      }
    
    
      public int[] shift(int[] numbers){
        int i;
        int size = numbers.length;
        int[] num = new int[size-1];
        for(i = 1; i < size; i++){
          num[i-1] = numbers[i];
        }
        num[7] = numbers[0];
        return num;
      }
    
    
     /* public int[] shuffle(int[] numbers){
        int i; int k;
        int size = numbers.length;
        int[] num = new int[size - 1];
        Random rand = new Random();
        for(i = 0, k = 0; i <= size; k++){
          num[k] = rand.nextInt();
          numbers.pop[]
        }
      }
      */
}
