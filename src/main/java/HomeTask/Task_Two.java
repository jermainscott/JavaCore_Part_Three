package HomeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Task_Two {


   /* Task 2:

List<Integer> list = new ArrayList<Integer>();
for(int i = 1, i < 10; i++){
list.add(i)
}

4.Repeat the same as in task 3 but collect all the elements in Array [];

5.filter values, keep those that start with "c", convert all values, convert to uppercase,
sort in Descending order

List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

*/

    public List<Integer> collectArrayElements() {
        List<Integer> list = new ArrayList<Integer>();//creates a list
        for(int i = 1; i < 10; i++){
            list.add(i);//adds elements to the list
        }
        // Convert list to stream, filter even numbers, and collect to an array
        Integer[] evenArray = list.stream()
                .filter(num -> num % 2 == 0)
                .toArray(Integer[]::new);

        // Print the array
        for (Integer num : evenArray) {
            System.out.print(num + " ");
        }
        return list;

    }

    public List<String> filterValues() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> filteredList = myList.stream()//creates a stream
                .filter(s -> s.startsWith("c"))//takes a function predicate
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())//sorts in descending order
                .toList();

        System.out.println(filteredList);
        return filteredList;
    }

    public static void main(String[] args) {
        Task_Two task_two = new Task_Two();
       // task_two.collectArrayElements();
        task_two.filterValues();
    }

}
