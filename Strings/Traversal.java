public class Traversal {

  public static void main(String[] args) {
    String s = "String Traversal";
    // Method 1
    for (int i = 0; i < s.length(); i++) System.out.print(s.charAt(i));
    System.out.println();

    // Method 2
    for (char ch : s.toCharArray()) System.out.print(ch);
        System.out.println();

    // Method 3
    s.chars().forEach(i -> System.out.print((char)i));
        System.out.println();

    // Method 4
    s.codePoints().forEach(i -> System.out.print((char)i));
        System.out.println();
    

    // Method 4(Not recommanded)
    for (String i : s.split("", 0)) System.out.print(i);
        System.out.println();
  }
}
