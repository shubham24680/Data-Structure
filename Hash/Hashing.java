import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        // Roll number(Key), Name(Value)
        HashMap<Integer, String> map = new HashMap<>();

        // Insertion
        map.put(42, "Sarthak");
        map.put(56, "Shruti");
        map.put(60, "Patel");
        map.put(61, "Sharma");
        map.put(62, "Verma");
        map.put(63, "Shulammine");
        map.put(70, "Simran");
        System.out.println(map);
        map.put(60, "Shubham");
        System.out.println(map);

        // Search
        System.out.println((map.containsKey(56) == true) ? "Person is Alive." : "Person is Dead.");
        System.out.println((map.containsKey(67) == true) ? "Person is Alive." : "Person is Dead.");

        System.out.println(map.get(63));
        System.out.println(map.get(36));

        // Iteration
        for (Map.Entry<Integer, String> i : map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        Set<Integer> s = map.keySet();
        for (Integer key : s) {
            System.out.println(key + " " + map.get(key));
        }

        // Remove
        map.remove(62);
        System.out.println(map);
    }
}
