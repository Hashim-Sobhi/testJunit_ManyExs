package iti.jets;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class StringUtilsTests {
    StringUtils stringUtils;
    @BeforeEach
    void setUp(){
        stringUtils = new StringUtils();
    }
    @ParameterizedTest
    @CsvFileSource(resources="/testData.csv", numLinesToSkip = 1)
    void testStringPalindrome(String text, boolean check){
        assertEquals(check ,stringUtils.isPalindrome(text));
    }
}
