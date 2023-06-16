package teste;

import org.example.testeOriginal.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsTest {

    @Test
    public void findMinimumTestEmptyt(){
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMinimum(nums));
    }
    @Test
    public void findMinimumTestPositiveNumber(){
        int[] nums = {20, 5, 6, 10,};
        assertEquals(5, ArrayUtils.findMinimum(nums));
    }
    @Test
    public void findMinimumTesNegativeNumber(){
        int[] nums = {-20, -5, -6, -10,};
        assertEquals(-20, ArrayUtils.findMinimum(nums));
    }
    @Test
    public void findMinimumTestDuplicateNumbers(){
        int[] nums = {20, 5, 3, 3, 6, 5};
        assertEquals(3, ArrayUtils.findMinimum(nums));
    }
    @Test
    public void findMinimumTestEqualNumbers(){
        int[] nums = {3, 3, 3, 3};
        assertEquals(3, ArrayUtils.findMinimum(nums));
    }

    @Test
    public void findMinimumTestOneNumber(){
        int[] nums = {3};
        assertEquals(3, ArrayUtils.findMinimum(nums));
    }

}
