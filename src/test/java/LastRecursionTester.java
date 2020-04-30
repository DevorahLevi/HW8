import edu.ti.caih313.recursion.LastRecursion;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class LastRecursionTester
{
    @Test
    public void testHandshake()
    {
        LastRecursion tester = new LastRecursion();

        //Test Case 0
        int test = LastRecursion.handshake(0);
        assertEquals(0, test);

        //Test Case 1
        test = LastRecursion.handshake(1);
        assertEquals(0, test);

        //Test Case 2
        test = LastRecursion.handshake(2);
        assertEquals(1, test);

        //Test Case 5
        test = LastRecursion.handshake(5);
        assertEquals(13, test);
    }

    @Test
    public void testFindLargestValue() {
        LastRecursion tester = new LastRecursion();

        int [] array = {4, 6, 12, 91};
        int test  = tester.findLargestValue(array);
        assertEquals(91, test);

    }
}
