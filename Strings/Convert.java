import java.nio.charset.Charset;

public class Convert {
    public static void main(String[] args) {
        //  1. Using concatination method.
        char c = 'S';
        String s = "";
        s = s + c;
        System.out.println(s);

        // 2. Using Character.toString() method.
        String s1 = Character.toString(c);
        System.out.println(s1);

        // 3. Using String.valueOf() method.
        String s2 = String.valueOf(c);
        System.out.println(s2); 

        // Constructors:
        // String(char[] char_arr, int start_index, int length)
        char st[] = {'P','e','n'};
        String b = new String(st,1,2);
        System.out.println(b);

        // String(byte[] byte_arr, int start_index, int length, Charset char_set)
        byte d[] = { 71, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        String css = new String(d, 1, 3, cs);
        System.out.println(css);
    }
}
