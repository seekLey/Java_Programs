public class Comparable_Program implements Comparable<Comparable_Program>{

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Comparable_Program(){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Comparable_Program s) {
        if(id > s.id){
            System.out.println("id is greater");
        }
        else
            System.out.println("id is smaller");

        return 0;
    }
}

