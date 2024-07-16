import com.codefinity.task.TaskThread;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TaskThreadTest {

    @Test
    public void testFactorialCalculation() {
        assertEquals(BigInteger.ONE, TaskThread.factorial(0));
        assertEquals(BigInteger.ONE, TaskThread.factorial(1));
        assertEquals(new BigInteger("2"), TaskThread.factorial(2));
        assertEquals(new BigInteger("6"), TaskThread.factorial(3));
        assertEquals(new BigInteger("24"), TaskThread.factorial(4));
        assertEquals(new BigInteger("120"), TaskThread.factorial(5));
        assertEquals(new BigInteger("720"), TaskThread.factorial(6));
        assertEquals(new BigInteger("5040"), TaskThread.factorial(7));
        assertEquals(new BigInteger("40320"), TaskThread.factorial(8));
        assertEquals(new BigInteger("362880"), TaskThread.factorial(9));
        assertEquals(new BigInteger("3628800"), TaskThread.factorial(10));
    }

    @Test
    public void testMultiThreadedFactorial2() throws InterruptedException {
        assertEquals(TaskThread.SIZE_MASSIVE, 100);
        assertEquals(TaskThread.results.length, 100);
        TaskThread.calculateFactorialsInParallel();
        BigInteger[] results = TaskThread.getResults();

        assertNotNull(results);

        for(int i = 0; i < TaskThread.SIZE_MASSIVE; i++) {
            assertEquals(results[i], TaskThread.factorial(i));
        }

        assertEquals(results.length, TaskThread.SIZE_MASSIVE);

    }
}
