package HomeTask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_Five {

    /*

Task 5:

 Write to a new list only letters that occur in the values of this map

Map<String, List<String>> people = new HashMap<>();
   people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
   people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
   people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

     */


    public static void main(String[] args) {

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243", "z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List<String> letters = people.values().stream()
                .flatMap(List::stream)
                .filter(value -> value.matches("[a-zA-Z]"))
                .toList();

        System.out.println("Letters: " + letters);
    }





}
