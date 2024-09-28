import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessLogicTest {

    BusinessLogic logic = new BusinessLogic();

    // Test for Method 1: calculatePayment
    @Test
    public void testCalculatePayment() {
        // Use a delta to account for floating-point precision issues
        assertEquals(110.0, logic.calculatePayment(100, 0.1), 0.0001);
        assertEquals(0.0, logic.calculatePayment(0, 0.1), 0.0001);
        assertEquals(100.0, logic.calculatePayment(100, 0.0), 0.0001);
        assertEquals(120.5, logic.calculatePayment(110, 0.095), 0.0001);
    }

    // Test for Method 2: applyDiscount
    @Test
    public void testApplyDiscount() {
        assertEquals(90.0, logic.applyDiscount(100, 10));
        assertEquals(100.0, logic.applyDiscount(100, 0));
        assertEquals(0.0, logic.applyDiscount(100, 100));
        assertEquals(75.0, logic.applyDiscount(100, 25));
    }

    // Test for Method 3: isPrime
    @Test
    public void testIsPrime() {
        assertTrue(logic.isPrime(5));
        assertTrue(logic.isPrime(7));
        assertFalse(logic.isPrime(4));
        assertFalse(logic.isPrime(1));
        assertFalse(logic.isPrime(-5));  // Edge case
        assertFalse(logic.isPrime(0));   // Edge case
        assertTrue(logic.isPrime(2));    // Smallest prime number
    }

    // Test for Method 4: factorial
    @Test
    public void testFactorial() {
        assertEquals(120, logic.factorial(5));
        assertEquals(1, logic.factorial(0));  // Edge case
        assertEquals(1, logic.factorial(1));  // Edge case
        assertEquals(2, logic.factorial(2));
    }

    // Test for Method 5: findMax
    @Test
    public void testFindMax() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, logic.findMax(array));

        int[] array2 = {-10, -5, -1};
        assertEquals(-1, logic.findMax(array2));

        int[] array3 = {10};
        assertEquals(10, logic.findMax(array3));

        int[] array4 = {-1000, 0, 999, 1000};
        assertEquals(1000, logic.findMax(array4));
    }

    // Test for Method 6: concatenate
    @Test
    public void testConcatenate() {
        assertEquals("HelloWorld", logic.concatenate("Hello", "World"));
        assertEquals("Hello", logic.concatenate("Hello", ""));
        assertEquals("World", logic.concatenate("", "World"));
        assertEquals("", logic.concatenate("", ""));
    }

    // Test for Method 7: isValidEmail
    @Test
    public void testIsValidEmail() {
        assertTrue(logic.isValidEmail("test@example.com"));
        assertTrue(logic.isValidEmail("user.name@domain.co"));
        assertFalse(logic.isValidEmail("test@com"));
        assertFalse(logic.isValidEmail("user@domain@com"));
        assertFalse(logic.isValidEmail("plainaddress"));
        assertFalse(logic.isValidEmail("user@.com"));
    }

    // Test for Method 8: areNumbersEqual
    @Test
    public void testAreNumbersEqual() {
        assertTrue(logic.areNumbersEqual(5, 5));
        assertFalse(logic.areNumbersEqual(5, 4));
        assertTrue(logic.areNumbersEqual(0, 0));
        assertFalse(logic.areNumbersEqual(-5, 5));
    }

    // Test for Method 9: convertToFahrenheit
    @Test
    public void testConvertToFahrenheit() {
        assertEquals(32.0, logic.convertToFahrenheit(0));
        assertEquals(212.0, logic.convertToFahrenheit(100));
        assertEquals(-40.0, logic.convertToFahrenheit(-40));  // Special case where Celsius = Fahrenheit
        assertEquals(104.0, logic.convertToFahrenheit(40));
    }

    // Test for Method 10: reverseString
    @Test
    public void testReverseString() {
        assertEquals("dcba", logic.reverseString("abcd"));
        assertEquals("olleH", logic.reverseString("Hello"));
        assertEquals("", logic.reverseString(""));
        assertEquals("a", logic.reverseString("a"));
    }
}
