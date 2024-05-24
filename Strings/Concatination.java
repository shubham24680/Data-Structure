public class Concatination {
    public static void main(String[] args) {
        // 1. Uising '+' operators. (only use at the beginning and the end)
        char c = 'G';
        String s = "eek";
        s = c + s;
        System.out.println(s);

        // 2. Using insert().
        StringBuffer buffer = new StringBuffer("Gek");
        buffer.insert(2,'e');
        System.out.println(buffer);

        // 3. Using substring().
        String s1 = new String("Shubhamatel");
        String one = s1.substring(0, 7);
        String two = s1.substring(7);
        s1 = one + 'P' + two;
        System.out.println(s1);
    }
}
