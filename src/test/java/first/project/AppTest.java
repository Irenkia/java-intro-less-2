package first.project;

import first.project.calculator.Calculator;
import first.project.checking.CheckingNumber;
import first.project.verification.AgeVerification;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void contextLoads() {
    }
    @Test
    public void shouldCalculatingPlus() {
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
    public void shouldCalculatingMinus() {
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
    public void shouldCalculatingMultiply() {
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
    public void shouldCalculatingDivide() {
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
    public void shouldAgeVerificationTrue() {
        //given
        int value = 22;
        boolean isVerification = true;

        //when
        isVerification = AgeVerification.isVerification(value);

        //then
        assertEquals(isVerification, AgeVerification.isVerification(22));
    }
    @Test
    public void shouldAgeVerificationFalse() {
        //given
        int value = 12;
        boolean isVerification = false;

        //when
        isVerification = AgeVerification.isVerification(value);

        //then
        assertEquals(isVerification, AgeVerification.isVerification(12));
    }
    @Test
    public void shouldCheckingNumberTrue() {
        //given
        int value = 22;
        boolean isCheckingNumber = true;

        //when
        isCheckingNumber = CheckingNumber.isNumberEven(value);

        //then
        assertEquals("even number", isCheckingNumber, CheckingNumber.isNumberEven(22));
    }
    @Test
    public void shouldCheckingNumberFalse() {
        //given
        int value = 11;
        boolean isCheckingNumber = false;

        //when
        isCheckingNumber = CheckingNumber.isNumberEven(value);

        //then
        assertEquals("number is not even", isCheckingNumber, CheckingNumber.isNumberEven(11));
    }
}