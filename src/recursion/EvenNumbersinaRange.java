package recursion;

public class EvenNumbersinaRange {
    public static int printevens(int start, int end){
        if (start > end) {
            return 0;
        }
        if (start % 2 == 0) {
            System.out.println(start);
        }
        return printevens(start + 1, end);
    }

    public static void main(String[] args) {
        printevens(1, 100);
    }
}
