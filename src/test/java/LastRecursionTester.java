import edu.ti.caih313.recursion.LastRecursion;
import org.junit.Test;

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

        //Testing array with even number of elements
        int [] array = {4, 6, 12, 91};
        int test  = tester.findMax(array, 0, array.length - 1);
        assertEquals(91, test);

        //Testing array with odd number of elements
        int [] array2 = {5, 78, 43, 2, 54};
        test  = tester.findMax(array2, 0, array2.length - 1);
        assertEquals(78, test);

        //Testing array with 7 elements
        int [] array3 = {3, 7, 2, 12, 45, 89, 4};
        test  = tester.findMax(array3, 0, array3.length - 1);
        assertEquals(89, test);

        //Testing array with 6 elements
        int [] array4 = {3, 2, 12, 45, 89, 4};
        test  = tester.findMax(array4, 0, array4.length - 1);
        assertEquals(89, test);

        //Testing array with largest item at the beginning
        int [] array5 = {102, 7, 2, 12, 45, 89, 4};
        test  = tester.findMax(array5, 0, array5.length - 1);
        assertEquals(102, test);

        //Testing array with largest item at the end
        int [] array6 = {3, 7, 2, 12, 45, 89, 212};
        test  = tester.findMax(array6, 0, array6.length - 1);
        assertEquals(212, test);
    }
}
