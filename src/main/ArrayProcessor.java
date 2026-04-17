// Đường dẫn: src/main/java/ArrayProcessor.java
public class ArrayProcessor {
    /**
     * Tính tổng các số nguyên dương chẵn trong mảng.
     */
    public int sumPositiveEvens(int[] numbers) {
        int sum = 0;
        
        // Nhánh 1: Kiểm tra mảng null
        if (numbers == null) {
            return 0; 
        }
        
        // Nhánh 2: Vòng lặp duyệt mảng
        for (int num : numbers) {
            // Nhánh 3: Điều kiện số dương và chẵn
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }
        
        return sum;
    }
}