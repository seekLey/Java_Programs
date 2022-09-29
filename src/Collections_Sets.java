
import java.util.HashSet;
import java.util.Set;

public class Collections_Sets {

    // SET will store the values in sorted order
    public static void main(String[] args) {
        Set<String> value = new HashSet<>();

        value.add("d");
        value.add("c");
        value.add("e");
        value.add("b");
        value.add("a");

        // Search a value if present return TRUE else FALSE
        System.out.println("value of e is present = " + value.contains("e"));
        System.out.println("value of g is present = " + value.contains("g"));

        for (String s : value) {
            System.out.println("sorted values " + s);
        }
    }
}