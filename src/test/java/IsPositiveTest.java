import org.example.IsPositive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
    @Test
    public void checkIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(3.5);
        //System.out.println(result);
        Assertions.assertTrue(result,"ai dat-o in bara");
    }

    @Disabled
    @Test
    public void checkIsPositiveFalse(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-4.7);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.5,4.6,8.9,Double.MAX_VALUE})
    public void checkIsPositiveParametrized(double numberFromValues){
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);

    }

    //Tema ex. 1
    @ParameterizedTest
    @ValueSource(doubles = {-1.1,-3.5,-2.8,-5.8})
    public void checkIsPositiveParametrized2(double numberFromValues){
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);

    }
}