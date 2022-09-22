public class Switch_Program {

    public static void main(String[] args) {

        int x = 7;
        switch (x) {
            /*
            switch (int y = 3 ) -- Compiler will throw error

            int y;
            switch (y = 3 ) -- Compiler will throw error

            char s ='h';
            switch (s ) -- Compiler PASS

            Switch only accepts Int, Char, Short and byte
            *
            * */
            case 2:
                System.out.println("2");
            case 7:
                System.out.println("3");
                break;
            default:
                System.out.println("Default");

        }
    }


}
