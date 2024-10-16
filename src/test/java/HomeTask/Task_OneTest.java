package HomeTask;

import java.util.List;

import static org.testng.Assert.*;

public class Task_OneTest {


 private Task_One task_one;

    @org.testng.annotations.BeforeMethod
    public void setUp() {

        task_one = new Task_One();
    }


    @org.testng.annotations.Test
    public void testCollectStreamElements() {

        task_one.collectStreamElements();
        assertEquals(task_one.collectStreamElements().size(), 20);


    }



}