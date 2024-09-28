import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessLogicTest {

    BusinessLogic logic = new BusinessLogic();

    @Test
    public void testCalculatePayment() {
        // Test with positive values
        assertEquals(110.0, logic.calculatePayment(100, 0.1));

        // Test with zero amount
        assertEquals(0.0, logic.calculatePayment(0, 0.1));

        // Test with zero tax rate
        assertEquals(100.0, logic.calculatePayment(100, 0.0));
    }

    @Test
    public void testApplyDiscount() {
        // Test with valid discount
        assertEquals(90.0, logic.applyDiscount(100, 10));

        // Test with zero discount
        assertEquals(100.0, logic.applyDiscount(100, 0));

        // Test with full discount
        assertEquals(0.0, logic.applyDiscount(100, 100));
    }

    @Test
    public void testIsPrime() {
        // Test with prime numbers
        assertTrue(logic.isPrime(5));
        assertTrue(logic.isPrime(7));

        // Test with non-prime numbers
        assertFalse(logic.isPrime(4));
        assertFalse(logic.isPrime(1));

        // Test with negative numbers
        assertFalse(logic.isPrime(-5));
    }

    @Test
    public void testFindMax() {
        // Test with positive numbers
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, logic.findMax(array));

        // Test with negative numbers
        int[] array2 = {-10, -5, -1};
        assertEquals(-1, logic.findMax(array2));

        // Test with single element
        int[] array3 = {10};
        assertEquals(10, logic.findMax(array3));
    }

    @Test
    public void testIsValidEmail() {
        // Valid email cases
        assertTrue(logic.isValidEmail("test@example.com"));
        assertTrue(logic.isValidEmail("user.name@domain.co"));

        // Invalid email cases
        assertFalse(logic.isValidEmail("test@com"));
        assertFalse(logic.isValidEmail("user@domain@com"));
        assertFalse(logic.isValidEmail("plainaddress"));
    }
}
