import java.util.*;

public class FindRepeatedNumbersInArrayList {
    /**
     * This program is to print the duplicate numbers in an ArrayList
     * @param args
     */
  public static void main(String [] args) {
      Integer inputArray[] = {13, 15, 67, 88, 65, 13, 67, 99, 65, 87, 13, 99, 199, 99, 99, 199};
      List<Integer> arrayList = Arrays.asList(inputArray);
      Set<Integer> outputSet = new HashSet<Integer>();
      Set<Integer> dupSet = new HashSet<Integer>();
      for (Integer element: arrayList) {
          if(!outputSet.add(element)){
              dupSet.add(element);
          }
      }
      System.out.println(dupSet);
  }
}
