package recursion;

public class DecimaltoBinaryConversion {

        public static String toBinary(int n) {
            if (n == 0) {
                return "0";
            } else if (n == 1) {
                return "1";
            } else {
                return toBinary(n / 2) + (n % 2);
            }
        }
        public static void main(String[] args) {
            int number = 10;
            System.out.println("Binary representation of " + number + " is: " + toBinary(number));
        }
    }
