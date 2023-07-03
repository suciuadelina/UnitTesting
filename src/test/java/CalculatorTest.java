import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }

    @Test
    public void checkSum(){
        double result = calculator.sum(4.5,2.3);
        Assertions.assertEquals(6.8,result,"rezultat incorect");
    }

    @Test
    public void checkMultiply(){
        double result = calculator.multiply(4.0,3.00);
        Assertions.assertEquals(12.00,result);
    }

    //Tema ex. 3

}