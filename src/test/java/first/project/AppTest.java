package first.project;

import first.project.calculator.Calculator;
import first.project.checking.CheckingNumber;
import first.project.verification.AgeVerification;
import first.project.weekdays.Weekdays;
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
    @Test
    public void shouldWeekdaysIsRight(){
        //given
        int value1 = 1;
        int value2 = 2;
        int value3 = 3;
        int value4 = 4;
        int value5 = 5;
        int value6 = 6;
        int value7 = 7;
        int value8 = 22;

        //when
        String result1 = Weekdays.days(value1);
        String result2 = Weekdays.days(value2);
        String result3 = Weekdays.days(value3);
        String result4 = Weekdays.days(value4);
        String result5 = Weekdays.days(value5);
        String result6 = Weekdays.days(value6);
        String result7 = Weekdays.days(value7);
        String result8 = Weekdays.days(value8);

        //then
        assertEquals("Monday", result1);
        assertEquals("Tuesday", result2);
        assertEquals("Wednesday", result3);
        assertEquals("Thursday", result4);
        assertEquals("Friday", result5);
        assertEquals("Weekend", result6);
        assertEquals("Weekend", result7);
        assertEquals("There is no such a day!", result8);
    }
}