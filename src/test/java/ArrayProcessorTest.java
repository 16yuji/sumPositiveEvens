
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayProcessorTest {
    ArrayProcessor processor = new ArrayProcessor();

    // --- Giữ nguyên test của Issue 1 (hoặc gộp chung) ---
    @Test
    public void testStatementCoverage() {
        assertEquals(0, processor.sumPositiveEvens(null));
        assertEquals(2, processor.sumPositiveEvens(new int[]{2}));
    }

  
@Test
    public void testPathCoverage() {
        // Path 1: Mảng null
        assertEquals(0, processor.sumPositiveEvens(null));

        // Path 2: Mảng rỗng (Vòng lặp không chạy)
        assertEquals(0, processor.sumPositiveEvens(new int[]{}));

        // Path 3: Mảng không có số dương chẵn (Điều kiện IF bên trong luôn sai)
        assertEquals(0, processor.sumPositiveEvens(new int[]{-2, 1, 3}));

        // Path 4: Mảng có số dương chẵn (Điều kiện IF đúng)
        assertEquals(10, processor.sumPositiveEvens(new int[]{4, 6}));
        
        // Bonus: Đường đi kết hợp (Có số thỏa mãn, có số không)
        assertEquals(6, processor.sumPositiveEvens(new int[]{2, -4, 5, 4}));
    }
}