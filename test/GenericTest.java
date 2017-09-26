import com.theironyard.Main;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.rmi.server.ExportException;

import static org.junit.Assert.*;

/**
 * Created by spenceroakes on 9/26/17.
 */
public class GenericTest {


    @Test
    public void isEvenTest () {
        System.out.println("Running isEvenTest");

        System.out.println("Testing Even Number");
        assertTrue(Main.isEven(2));

        System.out.println("Testing Even NUmber");
        assertTrue(Main.isEven(4));

        assertFalse("Testing Odd Number", Main.isEven(5));  // another way to write out message

    }
}
