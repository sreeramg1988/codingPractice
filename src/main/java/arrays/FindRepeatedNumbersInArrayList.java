package arrays;

import java.util.*;

public class FindRepeatedNumbersInArrayList {
    /**
     * This program is to print the duplicate numbers in an ArrayList
     * @param args
     */
  public static void main(String [] args) {
      Integer inputArray[] = {2, 13, 24, 13, 35, 70, 35, 90};
      List<Integer> arrayList = Arrays.asList(inputArray);
      Set<Integer> dupSet = new HashSet<>();

      for ( int listItem : arrayList) {
          if( ! dupSet.add(listItem) ){
              System.out.println("The duplicate element in the array list is : " + listItem);
          }
      }
  }
}
