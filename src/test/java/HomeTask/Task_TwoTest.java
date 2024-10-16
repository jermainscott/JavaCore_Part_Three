package HomeTask;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class Task_TwoTest {

    private Task_Two task_two;

    @BeforeMethod
    public void setUp() {

        task_two = new Task_Two();
    }


    @Test
    public void testCollectArrayElements() {
        List<Integer> result = task_two.collectArrayElements();//collects array elements
        Integer[] expectedArray = {2, 4, 6, 8};//expected array
        Integer[] actualArray = result.stream()//creates a stream
                .filter(num -> num % 2 == 0)//takes a function predicate
                .toArray(Integer[]::new);//collects to an array
        assertEquals(actualArray, expectedArray);//compares the actual array with the expected array

    }


    @Test
    public void testFilterValues() {
        task_two.filterValues();//filters values
        assertEquals(task_two.filterValues().size(), 2);
    }



}