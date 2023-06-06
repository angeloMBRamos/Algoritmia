package ex2;

import org.example.ex2.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.ex2.StringUtils.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    public void setUp(){
        stringUtils = new StringUtils();
    }

    @Test
    public void testPalindromes(){
        assertTrue(stringUtils.isPalindrome("ana"));
        assertTrue(isPalindrome("Ana"));
    }





}