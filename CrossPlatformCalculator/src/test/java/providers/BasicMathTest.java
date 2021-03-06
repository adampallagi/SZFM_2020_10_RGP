package providers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathTest {

    @Test
    void testAdd() {
        assertNotEquals(15, new BasicMath().add(4, 2));
        assertNotEquals(6, new BasicMath().add(2, 1));
        assertEquals(10, new BasicMath().add(5, 5));
    }

    @Test
    void testSubtract() {
        assertNotEquals(9, new BasicMath().subtract(21, 4));
        assertNotEquals(12, new BasicMath().subtract(22, 19));
        assertEquals(3, new BasicMath().subtract(8, 5));
    }

    @Test
    void testMultiply() {
        assertNotEquals(41, new BasicMath().multiply(3, 4));
        assertNotEquals(37, new BasicMath().multiply(2, 8));
        assertEquals(56, new BasicMath().multiply(7, 8));
    }

    @Test
    void testDivide() {
        assertNotEquals(10, new BasicMath().divide(8, 4));
        assertNotEquals(3, new BasicMath().divide(25, 5));
        assertEquals(4, new BasicMath().divide(28, 7));
    }

    @Test
    void testSin() {
        assertNotEquals(5, new BasicMath().sin(9));
        assertNotEquals(2, new BasicMath().sin(10));
        assertEquals(0.0175, new BasicMath().sin(1), 0.3);
    }

    @Test
    void testCos() {
        assertNotEquals(6, new BasicMath().cos(2));
        assertNotEquals(23, new BasicMath().cos(4));
        assertEquals(0.99985, new BasicMath().cos(1), 0.3);
    }

    @Test
    void testTan() {
        assertNotEquals(7, new BasicMath().tan(2.4));
        assertNotEquals(8, new BasicMath().tan(6.5));
        assertEquals(0.026, new BasicMath().tan(1.5), 0.3);
    }

    @Test
    void testCtg() {
        assertNotEquals(9, new BasicMath().ctg(4.7));
        assertNotEquals(6, new BasicMath().ctg(3.3));
        assertEquals(38.188, new BasicMath().ctg(1.5), 0.3);
    }

    @Test
    void testMod() {
        assertNotEquals(2, new BasicMath().mod(8, 2));
        assertNotEquals(7, new BasicMath().mod(9, 6));
        assertEquals(4, new BasicMath().mod(24, 5));
    }

    @Test
    void testPower() {
        assertNotEquals(5, new BasicMath().power(3, 2));
        assertNotEquals(34, new BasicMath().power(6, 7));
        assertEquals(625, new BasicMath().power(5, 4));
    }
      
    @Test
       void testSqrt(){
        assertNotEquals(4,new BasicMath().sqrt(9));
        assertNotEquals(16,new BasicMath().sqrt(36));
        assertEquals(5,new BasicMath().sqrt(25));
    }

    @Test
    void testFactorial(){
        assertNotEquals(3,new BasicMath().factorial(9));
        assertNotEquals(70,new BasicMath().factorial(10));
        assertEquals(24,new BasicMath().factorial(4));
    }

    @Test
    void testGcd(){
        assertNotEquals(2,new BasicMath().gcd(12,17));
        assertNotEquals(4,new BasicMath().gcd(30,48));
        assertEquals(3,new BasicMath().gcd(6,9));
    }

    @Test
    void testLcm(){
        assertNotEquals(24,new BasicMath().lcm(3,4));
        assertNotEquals(56,new BasicMath().lcm(6,7));
        assertEquals(6,new BasicMath().lcm(2,3));

    }
}