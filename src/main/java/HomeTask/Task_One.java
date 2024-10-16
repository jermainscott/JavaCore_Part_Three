package HomeTask;

import java.util.List;
import java.util.stream.Stream;

public class Task_One  {

    /*

Implement Unit Tests for each task.
Don't forget to add the ReadMe file, gitignore file


Task 1:

1.Show in console
Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

2.Create a list of random numbers using Stream.generate() , should have 20 items and print in console

3.Collect Stream elements to a List:  Convert list elements to stream,
select only even ones, use the collect method to collect them into a List:
     */


    public void showInConsole() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::println);
    }


    public void randomNumbers() {
        List<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 100))//takes a supplier
                .limit(20)
                .toList();
        System.out.println(randomNumbers);
    }


    public List<Integer> collectStreamElements() {
        List<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 100))
                .limit(20)
                .toList();
        List<Integer> evenNumbers = randomNumbers.stream()
                .filter(number -> number % 2 == 0)//takes a function predicate
                .toList();
        System.out.println(evenNumbers);
        return randomNumbers;
    }




    public static void main(String[] args) {
        Task_One task_one = new Task_One();
        task_one.showInConsole();
        task_one.randomNumbers();
        task_one.collectStreamElements();
    }



}
