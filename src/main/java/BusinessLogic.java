public class BusinessLogic {

    // Method 1: Calculate total payment with tax
    public double calculatePayment(double amount, double taxRate) {
        return amount + (amount * taxRate);
    }

    // Method 2: Apply discount
    public double applyDiscount(double price, double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

//    // Method 3: Check if a number is prime
//    public boolean isPrime(int number) {
//        if (number <= 1) return false;
//        for (int i = 2; i < Math.sqrt(number); i++) {
//            if (number % i == 0) return false;
//        }
//        return true;
//    }

    // Method 3: Check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) { // Use <= to include all divisors
            if (number % i == 0) return false;
        }
        return true;
    }


    // Method 4: Calculate factorial
    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    // Method 5: Find the maximum in an array
    public int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

    // Method 6: Concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method 7: Validate email address (Basic regex check)
    public boolean isValidEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    // Method 8: Check if two numbers are equal
    public boolean areNumbersEqual(int a, int b) {
        return a == b;
    }

    // Method 9: Convert Celsius to Fahrenheit
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method 10: Reverse a string
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
