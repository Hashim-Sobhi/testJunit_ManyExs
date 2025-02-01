package iti.jets;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.concurrent.TimeUnit;

class CalculatorTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("this happen before all testing");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("this happen after all tests");
    }
    @BeforeEach
    void before(){
        System.out.println("before each");
    }
    @AfterEach
    void after(){
        System.out.println("after each");
    }

    @RepeatedTest(5)
    @DisplayName("ABC-123 Test add functionality")
    @Tag("FIRST")
    void testAdd() {
        assertEquals(11, Calculator.add(5, 6));
        assertEquals(-11, Calculator.add(-5, -6));
        assertEquals(1, Calculator.add(-5, 6));
        assertEquals(-1, Calculator.add(5, -6));
        assertEquals(6, Calculator.add(0, 6));
        assertEquals(7, Calculator.add(7, 0));
    }

    @Test
    @DisplayName("ABC-123 Test sub functionality")
    @Tag("FIRST")
    //@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_12)
    @DisabledOnOs(OS.WINDOWS)
    void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3), "5 - 3 should be 2");
    }

    @Test
    @DisplayName("ABC-123 Test mul functionality")
    @Tag("SECOND")
    void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3), "2 * 3 should be 6");
    }

    @Test
    @DisplayName("ABC-123 Test div functionality")
    @Tag("SECOND")
    void testDivide() {
        assertEquals(2.0, Calculator.divide(6, 3), "6 / 3 should be 2.0");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
        assertEquals("devision by 0", exception.getMessage());
    }
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void timeOut() throws InterruptedException{
        Thread.sleep(4999);
    }
}
