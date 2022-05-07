import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class min_maxTest {
    min_max min_max =new min_max();
    @Test
    public void Min(){
        int[] arr={100,42,12,6,13,30,40};
        assertEquals(6,min_max.min(arr));
        int[] arr1={10,2,22,64,53,20,50};
        assertEquals(2,min_max.min(arr1));
        int[] arr2={50,22,32,65,23,50,60};
        assertEquals(22,min_max.min(arr2));


    }
    @Test
    public void Max(){
        int[] arr={100,42,12,6,13,30,40};
        assertEquals(100,min_max.max(arr));
        int[] arr1={10,2,22,64,53,20,50};
        assertEquals(64,min_max.max(arr1));
        int[] arr2={50,22,32,65,23,50,60};
        assertEquals(65,min_max.max(arr2));
    }

}