package recursion;

public class SubsetsofaSet {
    public static void generateSubsets(String s) {
        generateSubsets(s, "");
    }

    private static void generateSubsets(String s, String current) {
        if (s.isEmpty()) {
            System.out.println(current);
            return;
        }
        generateSubsets(s.substring(1), current);
        generateSubsets(s.substring(1), current + s.charAt(0));
    }

    public static void main(String[] args) {
        generateSubsets("abc");
    }
}
