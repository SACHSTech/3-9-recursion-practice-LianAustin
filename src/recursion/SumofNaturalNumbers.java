package recursion;

public class SumofNaturalNumbers {
    int sum = 0;
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
