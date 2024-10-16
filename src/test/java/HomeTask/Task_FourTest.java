package HomeTask;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class Task_FourTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(outContent)); // Redirects the output stream to the ByteArrayOutputStream

    }

    @Test
    public void testMain() {
        Task_Four.main(new String[]{});
        String expectedOutput = "Concatenated List: [1, 2, 3, 4, 5, 6, 7, 8, 9]\n" +
                "Combined List: [a, b, c, d, e, f, g, h]\n"+
                "Distinct Numbers List: [1, 2, 3, 4, 5, 6, 7]";

        // Compares the actual output with the expected output
        assertEquals(outContent.toString().trim(), expectedOutput.trim());
    }

}