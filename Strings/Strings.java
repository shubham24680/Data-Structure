// import java.nio.charset.Charset;

public class Strings {
    public static void main(String[] args) {
        // 1. String store in "String constant pool" (no dublicate memory location).
        // Immutable nature
        String s = "JAva";
        s.concat("Language");
        System.out.println(s);

        // 2. String store in "heap" (every time new string form with "new" keyword).
        String str = new String("  Semester Fourth  ");
        System.out.println(str);

        // This will add the String to "String constant pool"
        String intented = str.intern();
        System.out.println(intented);

        // StringBuffer: "Growable" and "writable" or "Immutable" Charaktcter sequences.
        StringBuffer a = new StringBuffer("Monday");
        System.out.println(a);

        // StringBuilder: Mutable sequence of Characters.
        StringBuilder sb = new StringBuilder();
        sb.append("new ");
        sb.append("College");
        System.out.println(sb);

        String str1 = "geekss@for@geekss";
        String[] arrOfStr = str1.split("@", 0);

        System.out.println("Split: ");
        for (String p : arrOfStr)
            System.out.print(p + " ");

        // ERROR: unreported exception UnsupportedEncodingException.
        // String(byte[] byte_arr, int start_index, int length, String char_set_name)
        // String cse = new String(d, 1, 4, "US-ASCII");
        // System.out.println(cse);

        // Methods:
        System.out.println("Length: " + sb.length());
        System.out.println("Character at index " + sb.indexOf("e", 0) + "is" + sb.charAt(2));
        System.out.println("Substring: " + sb.substring(5));
        System.out.println("Substring: " + sb.substring(5, 7));
        System.out.println("Last index: " + sb.lastIndexOf("e"));
        System.out.println("Equals: " + str.equals(intented));
        System.out.println("Equals Ignore case: " + str.equalsIgnoreCase(intented));
        System.out.println("Compare: " + s.compareTo(str));
        System.out.println("Compare Ignore case: " + s.compareToIgnoreCase(str));
        System.out.println("Upper case: " + s.toUpperCase());
        System.out.println("Lower case: " + s.toLowerCase());
        System.out.println("Trim: " + str.trim());
        System.out.println("StartWith: " + str.startsWith("F"));
        System.out.println("EndsWith: " + str.endsWith("ou"));
        System.out.println("IsEmpty: " + str.isEmpty());
        System.out.println("Replace: " + str.replace('o', 'u'));
        System.out.println("ReplaceAll: " + str.replaceAll("new", "old"));
        System.out.println("ReplaceFirst: " + str.replaceFirst("new", "old"));
        System.out.println("Reverse: " + sb.reverse());
    }
}
