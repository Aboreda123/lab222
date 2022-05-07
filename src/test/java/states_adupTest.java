import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class states_adupTest {
    states ADUP;
    @BeforeEach
    public void init(){
        ADUP=new states();
    }
    @AfterEach
    public void cleanUp(){
        ADUP=null;
    }
    @Test
    public void test0()
    {
        ADUP.statee('c');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:0",ADUP.getTime());
    }
    @Test
    public void test1()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:1",ADUP.getTime());
    }
    @Test
    public void test2()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:2",ADUP.getTime());
    }
    @Test
    public void test3()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,min",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:3",ADUP.getTime());
    }
    @Test
    public void test4()
    {
        ADUP.statee('c');
        ADUP.statee('a');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("0:0",ADUP.getTime());
    }
    @Test
    public void test5()
    {
        ADUP.statee('c');
        ADUP.statee('a');
        ADUP.statee('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("1:0",ADUP.getTime());
    }
    @Test
    public void test6()
    {
        ADUP.statee('c');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("2:0",ADUP.getTime());
    }
    @Test
    public void test7()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
    @Test
    public void test8()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,hour",ADUP.getState());
        assertEquals("2000-1-1",ADUP.getDate());
        assertEquals("2:1",ADUP.getTime());
    }
    @Test
    public void test9()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('a');
        ADUP.statee('b');
        assertEquals("UPDATE,day",ADUP.getState());
        assertEquals("2000-1-2",ADUP.getDate());
        assertEquals("0:2",ADUP.getTime());
    }
    @Test
    public void test10()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,day",ADUP.getState());
        assertEquals("2000-1-4",ADUP.getDate());
        assertEquals("0:1",ADUP.getTime());
    }
    @Test
    public void test11()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,month",ADUP.getState());
        assertEquals("2000-4-1",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
    @Test
    public void test12()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2003-2-2",ADUP.getDate());
        assertEquals("2:2",ADUP.getTime());
    }
    @Test
    public void test13()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2002-2-2",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
    @Test
    public void test14()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2005-3-3",ADUP.getDate());
        assertEquals("1:4",ADUP.getTime());
    }
    @Test
    public void test15()
    {
        ADUP.statee('c');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('b');
        ADUP.statee('a');
        ADUP.statee('b');
        ADUP.statee('b');
        assertEquals("UPDATE,year",ADUP.getState());
        assertEquals("2002-9-1",ADUP.getDate());
        assertEquals("1:2",ADUP.getTime());
    }
}