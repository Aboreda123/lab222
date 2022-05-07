import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class statesTest {

    states states;
    @BeforeEach
    public void init(){
        states=new states();
    }
    @AfterEach
    public void cleanUp(){
        states =null;
    }


    @Test
    public void test00()
    {
        states.statee('a');
        assertEquals("NORMAL,DATE",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test0()
    {
        states.statee('a');
        states.statee('a');
        assertEquals("NORMAL,TIME",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }

    @Test
    public void test1()
    {
        states.statee('a');
        states.statee('a');
        states.statee('a');
        assertEquals("NORMAL,DATE",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test2()
    {
        states.statee('b');
        assertEquals("ALARM,Alarm",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test3()
    {
        states.statee('b');
        states.statee('a');
        assertEquals("ALARM,CHIME",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test4()
    {
        states.statee('b');
        states.statee('a');
        states.statee('d');
        assertEquals("NORMAL,TIME",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test5()
    {
        states.statee('b');
        states.statee('a');
        states.statee('d');
        assertEquals("NORMAL,TIME",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test6()
    {
        states.statee('c');
        assertEquals("UPDATE,min",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("0:0", states.getTime());

    }
    @Test
    public void test7()
    {
        states.statee('c');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        assertEquals("UPDATE,hour",states.getState());
        assertEquals("2000-1-1",states.getDate());
        assertEquals("1:1", states.getTime());

    }
    @Test
    public void test8()
    {
        states.statee('c');
        states.statee('b');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');

        assertEquals("UPDATE,day",states.getState());
        assertEquals("2000-1-2",states.getDate());
        assertEquals("2:3", states.getTime());

    }
    @Test
    public void test9()
    {
        states.statee('c');
        states.statee('b');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        assertEquals("UPDATE,year",states.getState());
        assertEquals("2001-2-2",states.getDate());
        assertEquals("2:3", states.getTime());

    }
    @Test
    public void test10()
    {
        states.statee('c');
        states.statee('b');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        assertEquals("NORMAL,TIME",states.getState());
        assertEquals("2001-2-2",states.getDate());
        assertEquals("2:3", states.getTime());

    }
    @Test
    public void test11()
    {
        states.statee('c');
        states.statee('b');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('a');
        states.statee('b');
        states.statee('d');
        assertEquals("NORMAL,TIME",states.getState());
        assertEquals("2001-2-2",states.getDate());
        assertEquals("2:3", states.getTime());

    }



}