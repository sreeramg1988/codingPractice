import java.util.*;
import java.util.stream.Collectors;

public class FindRepeatedNumbersInArrayList {
    /**
     * This program is to print the duplicate numbers in an ArrayList
     * @param args
     */
  public static void main(String [] args) {
      Integer inputArray[] = {13, 15, 67, 88, 65, 13, 67, 99, 65, 87, 13, 99, 199, 99, 99, 199};
      List<Integer> arrayList = Arrays.asList(inputArray);
      Set<Integer> outputSet = new HashSet<>();
      Set<Integer> dupSet = new HashSet<>();
      List<Integer> filterList = arrayList.stream()
                                 .filter(element -> !outputSet.add(element))
                                 .collect(Collectors.toList());
      dupSet.addAll(filterList);
      System.out.println(dupSet);
  }
}
