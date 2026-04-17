
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
@Test
    public void testPathCoverage() {
        // Path 1: Input null
        assertEquals(0, processor.sumPositiveEvens(null));

        // Path 2: Mảng rỗng
        assertEquals(0, processor.sumPositiveEvens(new int[]{}));

        // Path 3: Mảng không có số dương chẵn (Vào vòng lặp nhưng không vào khối sum += num)
        assertEquals(0, processor.sumPositiveEvens(new int[]{-2, 1, 3}));

        // Path 4: Mảng kết hợp (Vào vòng lặp, có cái thỏa mãn, có cái không)
        assertEquals(10, processor.sumPositiveEvens(new int[]{2, 3, 8, -4}));
    }
