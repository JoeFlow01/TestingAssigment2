import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Odd_EvenTest {
    @Test
    public void Tester(){
        Odd_Even test=new Odd_Even();
        assertEquals("Odd",test.Even_Odd(1));
    }
    @Test
    public void Tester1(){
        Odd_Even test=new Odd_Even();
        assertEquals("Even",test.Even_Odd(2));
    }
    @Test
    public void Tester2(){
        Odd_Even test=new Odd_Even();
        assertEquals("Odd",test.Even_Odd(3));
    }
    @Test
    public void Tester3(){
        Odd_Even test=new Odd_Even();
        assertEquals("Odd",test.Even_Odd(1));
    }
    @Test
    public void Tester4(){
        Odd_Even test=new Odd_Even();
        assertEquals("Odd",test.Even_Odd(-5));
    }
    @Test
    public void Tester5(){
        Odd_Even test=new Odd_Even();
        assertEquals("Even",test.Even_Odd(8));
    }

}