import java.util.*;

public class Collection_hashMap {

    // HashMap is used to store KEY, VALUE mapping of data, It stores data in un-ordered manner also DUPLICATES gets truncated
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Shaw", 100);
        phonebook.put("Praks", 101);
        phonebook.put("Maaz", 102);
        phonebook.put("Sam", 103);
        phonebook.put("Sree", 104);
        phonebook.put("Camel", 105);

//        System.out.println(phonebook.get("Shaw"));

        Set<String> keys = phonebook.keySet();
        for (String i : keys) {
            System.out.println(i + " " + phonebook.get(i));
        }

    }

}
