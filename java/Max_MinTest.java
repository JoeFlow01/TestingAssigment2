import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max_MinTest {
    @Test
    public void TesterMax(){
        double numbers[]={23,67,3,8,3,-4};
        Max_Min test=new Max_Min();
        assertEquals(67,test.max(numbers));
    }
    @Test
    public void TesterMax1(){
        double numbers[]={-23,-67,-3,-8,-3,-4};
        Max_Min test=new Max_Min();
        assertEquals(-3,test.max(numbers));
    }
    @Test
    public void TesterMax2(){
        double numbers[]={253,657,30,18,233,34544};
        Max_Min test=new Max_Min();
        assertEquals(34544,test.max(numbers));
    }
    @Test
    public void TesterMin(){
        double numbers[]={253,657,30,18,233,34544};
        Max_Min test=new Max_Min();
        assertEquals(18,test.min(numbers));
    }
    @Test
    public void TesterMin1(){
        double numbers[]={253,657,-30,18,233,34544};
        Max_Min test=new Max_Min();
        assertEquals(-30,test.min(numbers));
    }
    @Test
    public void TesterMin2(){
        double numbers[]={-253,-657,-30,-18,-233,-34544};
        Max_Min test=new Max_Min();
        assertEquals(-34544,test.min(numbers));
    }

}