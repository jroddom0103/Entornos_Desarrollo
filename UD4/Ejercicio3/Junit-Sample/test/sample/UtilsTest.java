/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jroddom0103
 */
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = null;
        String expResult = "";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 0;
        String expResult = "";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
    }
    
}
