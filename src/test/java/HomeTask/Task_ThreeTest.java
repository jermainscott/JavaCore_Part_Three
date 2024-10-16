package HomeTask;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.testng.Assert.*;

public class Task_ThreeTest {

    private Task_Three task_three;

    //creates a new byte array output stream
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeMethod
    public void setUp() {

        task_three = new Task_Three();
        System.setOut(new PrintStream(outContent));//redirects the output stream to the ByteArrayOutputStream

    }

    @Test
    public void testDisplayNames() {

        task_three.displayNames();
        String expectedOutput = "Filtered Names: [abibaba, amitabh]\n" +
                "All match 'S': false\n" +
                "Any match 'S': true\n" +
                "None match 'H': true\n" +
                "Number of elements in the stream: 9\n" +
                "Number of names starting with 'A': 3\n" +
                "First name starting with 'L': Lokesh\n";

        //compares the actual output with the expected output
        assertEquals(outContent.toString().trim(), expectedOutput.trim());

    }


}