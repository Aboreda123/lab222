import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ev_odTest {
    ev_od ev_od =new ev_od();
    @Test
    public void NumIsEven(){

        assertEquals("Even",ev_od.IsEvenOrOdd(14));
        assertEquals("Even",ev_od.IsEvenOrOdd(16));
        assertEquals("Even",ev_od.IsEvenOrOdd(20));
    }
    @Test
    public void NumIsOdd(){
        assertEquals("Odd",ev_od.IsEvenOrOdd(7));
        assertEquals("Odd",ev_od.IsEvenOrOdd(11));
        assertEquals("Odd",ev_od.IsEvenOrOdd(13));

    }
    @Test
    public void NumIsNegativeEven(){

        assertEquals("Even",ev_od.IsEvenOrOdd(-2));
        assertEquals("Even",ev_od.IsEvenOrOdd(-8));
        assertEquals("Even",ev_od.IsEvenOrOdd(-10));

    }
    @Test
    public void NumIsNegativeOdd(){
        assertEquals("Odd",ev_od.IsEvenOrOdd(-3));
        assertEquals("Odd",ev_od.IsEvenOrOdd(-5));
        assertEquals("Odd",ev_od.IsEvenOrOdd(-15));

    }
}