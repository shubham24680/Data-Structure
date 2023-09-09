import java.util.HashMap;
import java.util.Map;

public class Itinerary {
    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        list.put("Chennai", "Banglore");
        list.put("Bombay", "Delhi");
        list.put("Goa", "Chennai");
        list.put("Delhi", "Goa");
        reverse(list);
    }

    static void reverse(HashMap<String, String> list) {
        HashMap<String, String> rev = new HashMap<>();
        for (Map.Entry<String, String> entry : list.entrySet()) {
            rev.put(entry.getValue(), entry.getKey());
        }

        String from = null;
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (!rev.containsKey(entry.getKey()))
                from = entry.getKey();
        }

        if (from == null) {
            System.out.println("Case is Invalid.");
            return;
        }

        String to = list.get(from);
        while (to != null) {
            System.out.print(from + " -> ");
            from = to;
            to = list.get(to);
        }
        System.out.println(from);
    }
}
