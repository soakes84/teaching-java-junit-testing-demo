import com.theironyard.BadInputException;
import com.theironyard.Main;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static org.junit.Assert.*;

/**
 * Created by spenceroakes on 9/26/17.
 */
public class GenericTest {

    @Test
    public void isEvenTest () {
        System.out.println("Running isEven Test");

        System.out.println("Testing Even Number");
        assertTrue(Main.isEven(2));

        System.out.println("Testing Even NUmber");
        assertTrue(Main.isEven(4));

        assertFalse("Testing Odd Number", Main.isEven(5));  // another way to write out message

    }

    @Test
    public void isOddTest () {
        System.out.println("Running isOdd Test");

        assertTrue(Main.isOdd(3));
        assertTrue(Main.isOdd(333));
        assertFalse(Main.isOdd(30));
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void isOddUnder50TestWithInputs () throws BadInputException {
        System.out.println("Running isOddTestWithInputs");

        assertTrue("Testing Odd Number", Main.isOddUnder50(45));
        assertFalse("Testing Even Number", Main.isOddUnder50(46));
    }

    @Test
    public void isOddUnder50TestWithBadInputs () throws BadInputException {
        expected.expect(BadInputException.class);
        Main.isOddUnder50(51);
    }

    @Test
    public void sumOf3NumbersTest () {
        assertEquals(Main.sum3Numbers(3,4,5), 12);
        assertEquals(Main.sum3Numbers(1,2,3), 6);
        assertNotEquals(Main.sum3Numbers(1,1,1), 17);
    }

    @Test
    public void sumOf3NumbersTestNegNums () {
        assertEquals(Main.sum3Numbers(-5,5,0), 0);
        assertEquals(Main.sum3Numbers(-5,-5,-5), -15);
        assertNotEquals(Main.sum3Numbers(-5, 5, 5), 0);
    }

    @Test
    public void isMultipleOf3Test () {
        assertTrue(Main.isMultipleOf3(9));
        assertFalse(Main.isMultipleOf3(11));
    }
}
