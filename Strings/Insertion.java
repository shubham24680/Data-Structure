public class Insertion {

  public static void main(String[] args) {
    String s = "GeeksGeeks";
    String i = "for";
    int k = 5;
    // Method 1
    String res = s.substring(0, k) + i + s.substring(k);
    System.out.println(res);

    // Method 2
    StringBuilder str = new StringBuilder();
    str.append(s);
    str.insert(k, i);
    System.out.println(s);
    System.out.println(i);
    System.out.println(str.toString());
  }
}
