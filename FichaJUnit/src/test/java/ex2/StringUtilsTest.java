package ex2;

import org.example.ex2.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example.ex2.StringUtils.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testPalindromeValido(){
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("Ana"));
        assertTrue(StringUtils.isPalindrome(""));
        assertTrue(StringUtils.isPalindrome("ana lol ana"));
    }

    @Test
    public void testPalindromeInvalido(){
        assertFalse(StringUtils.isPalindrome("Àna"));
        assertFalse(StringUtils.isPalindrome("ana lool lool"));
        assertFalse(StringUtils.isPalindrome("an-a"));
        assertFalse(StringUtils.isPalindrome(null));
    }






}