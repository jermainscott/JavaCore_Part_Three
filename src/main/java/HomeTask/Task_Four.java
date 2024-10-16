package HomeTask;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Task_Four {
  /*
Task 4:

11.
Java Stream flatMap() - concatenate 3 arrays into one using flatMap ()

    List<Integer> list1 = Arrays.asList(1,2,3);
    List<Integer> list2 = Arrays.asList(4,5,6);
    List<Integer> list3 = Arrays.asList(7,8,9);

And these are also combined into 1 String[][] dataArray = new String[][]
{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};


12.
Stream.distinct() to remove duplicates - remove duplicates from this array and display.
            ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

   */

    public static void main(String[] args) {

        //Concatenate 3 arrays into one using flatMap ()
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);

        List<Integer> concatenatedList = Stream.of(list1, list2, list3)//Stream<List<Integer>>
                .flatMap(List::stream)
                .toList();

        System.out.println("Concatenated List: " + concatenatedList);


        // Combine 2D array into a single list using flatMap()
        String[][] dataArray = {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        List<String> combinedList = Arrays.stream(dataArray)
                .flatMap(Arrays::stream)
                .toList();

        System.out.println("Combined List: " + combinedList);



        //Remove duplicates from this array and display.
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        List<Integer> distinctNumbersList = numbersList.stream()
                .distinct()
                .toList();

        System.out.println("Distinct Numbers List: " + distinctNumbersList);

    }

}
