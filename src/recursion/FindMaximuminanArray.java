package recursion;

public class FindMaximuminanArray {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4, 2, 3, 9, 5, 2}, 9));
    }
}
