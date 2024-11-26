package recursion;

public class SumofDigits {

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}
