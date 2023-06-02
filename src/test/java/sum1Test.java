import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unit.SumCalculator;

public class sum1Test {
    @BeforeEach
    public void beforeEach(){
        SumCalculator sum = new SumCalculator();
    }

    @Test
    public void sumTest1(){
        Assertions.assertEquals(1, new SumCalculator().sum(1));
    }
    @Test
    public void sumTest3(){
        Assertions.assertEquals(6, new SumCalculator().sum(3));
    }
    @Test
    public void sumTest0(){
        try{
            Assertions.assertEquals(0, new SumCalculator().sum(0));
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
