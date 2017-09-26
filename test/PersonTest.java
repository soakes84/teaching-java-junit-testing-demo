import com.theironyard.Person;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by spenceroakes on 9/26/17.
 */
public class PersonTest {
    Person spencer = new Person("Spencer Oakes", 32);

    @Test
    public void PersonTestName () {
            assertEquals(spencer.getName(), "Spencer Oakes");
            assertNotEquals(spencer.getName(), "Andi Coaker");
            assertNotEquals(spencer.getName(), "spencer Oakes");
    }

    @Test
    public void PersonTestAge () {
        assertEquals(spencer.getAge(), 32);
        assertNotEquals(spencer.getAge(), 21);
    }
}
