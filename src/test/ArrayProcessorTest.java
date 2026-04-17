
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayProcessorTest {
    ArrayProcessor processor = new ArrayProcessor();

    @Test
    public void testStatementCoverage() {
        // Trường hợp 1: Mảng null để bao phủ lệnh 'return 0' đầu tiên
        assertEquals(0, processor.sumPositiveEvens(null));

        // Trường hợp 2: Mảng có số dương chẵn để bao phủ logic bên trong vòng lặp và lệnh if
        int[] input = {2, 4};
        assertEquals(6, processor.sumPositiveEvens(input));
    }
}
