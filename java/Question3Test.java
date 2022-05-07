import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {
    @Test
    public void Tester1(){
        Question3 test=new Question3();
        String sequence="ama";
        assertEquals("invalid-input",test.clock(sequence));
    }
    @Test
    public void Tester2(){
        Question3 test=new Question3();
        String sequence="125";
        assertEquals("invalid-input",test.clock(sequence));
    }
    @Test
    public void Tester3(){
        Question3 test=new Question3();
        String sequence="abadcaaaaa";
        assertEquals("State: Display Date:1/1/2000 Time: 0:0",test.clock(sequence));
    }
    @Test
    public void Tester4(){
        Question3 test=new Question3();
        String sequence="aabadcda";
        assertEquals("State: Display Date:1/1/2000 Time: 0:0",test.clock(sequence));
    }
    @Test
    public void Tester5(){
        Question3 test=new Question3();
        String sequence="abdacabbab";
        assertEquals("State: update Date:2/1/2000 Time: 2:0",test.clock(sequence));
    }
    @Test
    public void Tester6(){
        Question3 test=new Question3();
        String sequence="caabbabdaa";
        assertEquals("State: Display Date:3/2/2000 Time: 0:0",test.clock(sequence));
    }
    @Test
    public void Tester7(){
        Question3 test=new Question3();
        String sequence="abadcbabbb";
        assertEquals("State: update Date:1/1/2000 Time: 3:1",test.clock(sequence));
    }
    @Test
    public void Tester8(){
        Question3 test=new Question3();
        String sequence="acababaabbbab";
        assertEquals("State: alarm Date:2/1/2003 Time: 1:0",test.clock(sequence));
    }
    @Test
    public void Tester9(){
        Question3 test=new Question3();
        String sequence="aacbbbabbaaabab";
        assertEquals("State: alarm Date:1/1/2001 Time: 2:3",test.clock(sequence));
    }


}