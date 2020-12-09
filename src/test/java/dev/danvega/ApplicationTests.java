package dev.danvega;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApplicationTests {

    @Test( expected = IllegalArgumentException.class)
    public void emptyFirstName_ShouldThrowIllegalArgumentException() {
        String userInput = "\nVega\ndanvega@gmail.com";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        Application.main(null);
    }

    @Test
    public void validUserInput_ShouldResultInExpectedOutput() {
        String userInput = "Dan\nVega\ndanvega@gmail.com";
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);

        String expected = "Dan,Vega,danvega@gmail.com";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        Application.main(null); // call the main method

        String[] lines = baos.toString().split("\n");
        String actual = lines[lines.length-1];

        // checkout output
        Assert.assertEquals(expected,actual);
    }


}
