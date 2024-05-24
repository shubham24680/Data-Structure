public class java8 {
    public static void main(String[] args) {
        String s = "babber";
        long count = s.chars().filter(ch -> (char)ch == 'b').count();
        System.out.println(count);
    }
}
