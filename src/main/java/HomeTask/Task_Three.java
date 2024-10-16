package HomeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_Three {

 /*
 Task 3:

6.
a) Display names that start with ‘A’ and have length > 5;
b) Sort all names and display them in lower case on the screen

List<String> memberNames = new ArrayList<>();
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Shahrukh");
memberNames.add("Abibaba");
memberNames.add("Salman");
memberNames.add("Yana");
memberNames.add("Lokesh");

7.
Stream.match() - Various matching operations can be used to check whether a given predicate matches the stream elements.
 Match returns a boolean result.
From task 6, take an array and check with allMatch or anyMatch whether the list contains names with
the letter ‘S’ (allMatch should display false, anyMatch should display true)
From task 6, take an array and check with noneMatch whether the list contains
names with the letter ‘H’ (should display true)

8.
Stream.count() - The count() is a terminal operation returning the number of elements in
the stream as a long value.

9.
From task 6 count the number of names starting with “A” - display their number.


10.
Stream.findFirst() - take the array from task 6 and print the first name starting with ‘L’


   */

public void displayNames() {
    List<String> memberNames = new ArrayList<>();
    memberNames.add("Amitabh");
    memberNames.add("Shekhar");
    memberNames.add("Aman");
    memberNames.add("Rahul");
    memberNames.add("Shahrukh");
    memberNames.add("Abibaba");
    memberNames.add("Salman");
    memberNames.add("Yana");
    memberNames.add("Lokesh");

    //takes a function predicate,Display names that start with ‘A’ and have length > 5 then
    //Sort all names and display them in lower case on the screen
    List<String> filteredNames = memberNames.stream()
            .filter(name -> name.startsWith("A") && name.length() > 5)
            .map(String::toLowerCase)
            .sorted()
            .toList();
    System.out.println("Filtered Names: " + filteredNames);


    // Check with allMatch or anyMatch whether the list contains names with the letter ‘S’
    boolean allMatch = memberNames.stream().allMatch(name -> name.contains("S"));
    boolean anyMatch = memberNames.stream().anyMatch(name -> name.contains("S"));
    System.out.println("All match 'S': " + allMatch); // should display false
    System.out.println("Any match 'S': " + anyMatch); // should display true


    // Check with noneMatch whether the list contains names with the letter ‘H’
    boolean noneMatch = memberNames.stream().noneMatch(name -> name.contains("H"));
    System.out.println("None match 'H': " + noneMatch); // should display true


    // Count the number of elements in the stream
    long count = memberNames.stream().count();
    System.out.println("Number of elements in the stream: " + count);


    // Count the number of names starting with "A"
    long countNamesStartingWithA = memberNames.stream()
            .filter(name -> name.startsWith("A"))
            .count();
    System.out.println("Number of names starting with 'A': " + countNamesStartingWithA);


    // Print the first name starting with 'L'
    String firstNameStartingWithL = memberNames.stream()
            .filter(name -> name.startsWith("L"))//takes a function predicate
            .findFirst()//returns an Optional
            .orElse("No name found");
    System.out.println("First name starting with 'L': " + firstNameStartingWithL);


}



    public static void main(String[] args) {
        Task_Three task_three = new Task_Three();
        task_three.displayNames();
    }



}
