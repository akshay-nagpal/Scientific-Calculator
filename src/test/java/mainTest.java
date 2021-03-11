import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;
public class mainTest {

    private static final double DELTA = 1e-15;
    main mainobj = new main();

    @Test
    public void factorialTruePositive(){
        assertEquals("Testing factorial for True Positive", 24, mainobj.factorial(4), DELTA);
        assertEquals("Testing factorial for True Positive", 6, mainobj.factorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Testing factorial for False Positive", 120, mainobj.factorial(6), DELTA);
        assertNotEquals("Testing factorial for False Positive", 24, mainobj.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Testing power function for True Positive", 243, mainobj.power(3, 5), DELTA);
        assertEquals("Testing power function for True Positive",125 , mainobj.power(5, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Testing Power function for False Positive", 768, mainobj.power(3, 4), DELTA);
        assertNotEquals("Testing Power function for False Positive", 7451, mainobj.power(6, 4), DELTA);
    }
    @Test
    public void logarithmTruePositive(){
        assertEquals("Testing natural log for True Positive", 0, mainobj.logarithm(1), DELTA);
        assertEquals("Testing natural log for True Positive", 0, mainobj.logarithm(1), DELTA);
    }

    @Test
    public void logarithmFalsePositive(){
        assertNotEquals("Testing natural log for False Positive", 784, mainobj.logarithm(65), DELTA);
        assertNotEquals("Testing natural log for False Positive", 4871.256, mainobj.logarithm(845), DELTA);
    }

    @Test
    public void squarerootTruePositive(){
        assertEquals("Testing square root for True Positive", 4, mainobj.squareroot(16), DELTA);
        assertEquals("Testing square root for True Positive", 6, mainobj.squareroot(36), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Testing square root for False Positive", 4.5, mainobj.squareroot(32), DELTA);
        assertNotEquals("Testing square root for False Positive", 5.6, mainobj.squareroot(25), DELTA);

    }

}