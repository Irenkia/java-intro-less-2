package first.project;

import first.project.calculator.Calculator;
import first.project.verification.AgeVerification;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void contextLoads() {
    }
    @Test
    public void souldCalculatingPlus() {
        //given
        int value1 = 3;
        int value2 = 5;
        char operationPlus = '+';

        //when
        int resultPlus = Calculator.calculating(value1, value2, operationPlus);

        //then
        assertEquals(8, resultPlus);
    }
    @Test
    public void souldCalculatingMinus() {
        //given
        int value1 = 10;
        int value2 = 6;
        char operationMinus = '-';

        //when
        int resultMinus = Calculator.calculating(value1, value2, operationMinus);

        //then
        assertEquals(4, resultMinus);
    }
    @Test
    public void souldCalculatingMultiply() {
        //given
        int value1 = 5;
        int value2 = 3;
        char operationMultiply = '*';

        //when
        int resultMultiply = Calculator.calculating(value1, value2, operationMultiply);

        //then
        assertEquals(15, resultMultiply);
    }
    @Test
    public void souldCalculatingDivide() {
        //given
        int value1 = 102;
        int value2 = -2;
        char operationDivide = '/';

        //when
        int resultDivide = Calculator.calculating(value1, value2, operationDivide);

        //then
        assertEquals(5, resultDivide);
    }
    @Test
    public void souldAgeVerificationTrue() {
        //given
        int value = 22;
        boolean isVerification = true;

        //when
        isVerification = AgeVerification.verification(value);

        //then
        assertEquals(isVerification, AgeVerification.verification(22));
    }
    @Test
    public void souldAgeVerificationFalse() {
        //given
        int value = 12;
        boolean isVerification = false;

        //when
        isVerification = AgeVerification.verification(value);

        //then
        assertEquals(isVerification, AgeVerification.verification(12));
    }

}