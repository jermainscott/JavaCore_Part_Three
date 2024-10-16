package HomeTask;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

public class Task_FiveTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeMethod
    public void setUp() {

        System.setOut(new PrintStream(outContent)); // Redirects the output stream to the ByteArrayOutputStream

    }

    @Test
    public void testMain() {
        Task_Five.main(new String[]{});
        String expectedOutput = "Letters: [d, s, a, z]";

        // Compares the actual output with the expected output
        assertEquals(outContent.toString().trim(), expectedOutput.trim());

    }


}