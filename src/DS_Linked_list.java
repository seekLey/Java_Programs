import java.util.LinkedList;

public class DS_Linked_list {


    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(9);
        li.add(8);
        li.add(7);
        li.add(6);
        System.out.println(li);

        if (li.getFirst() == li.getLast())
            System.out.println("same");
        else
            System.out.println("different");



    }

}
