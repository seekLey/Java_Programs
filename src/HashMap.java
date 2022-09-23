import java.util.*;

public class HashMap{

    public static void main(String[] args) {
        Map<String,String> phonebook = new java.util.HashMap<>();
        phonebook.put("Shaw","9183231123");
        phonebook.put("Praks","9183231888");
        phonebook.put("Maaz","9183098123");
        phonebook.put("Sam","954331123");
        phonebook.put("Sree","9187131123");
        phonebook.put("Camel","9183298723");

//        System.out.println(phonebook.get("Shaw"));

        Set<String> keys = phonebook.keySet();
        for(String i :keys)
        {
            System.out.println(i+" "+phonebook.get(i));
        }

    }

}
