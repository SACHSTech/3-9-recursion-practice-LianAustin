package recursion;

public class ReverseaString {
    public String reverse(String s){
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }    

    public static void main(String[] args) {
        ReverseaString reverser = new ReverseaString();
        System.out.println(reverser.reverse("bobsdfsd"));
    }
}
