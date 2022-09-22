import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput_From_User {


    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("Please enter a number");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        a = Integer.parseInt(s);
        System.out.println("Entered number is "+a);

        if(a%2 == 0){
            System.out.println("Entered number is Even");
        }
        else {
            System.out.println("Entered number is ODD");
        }


    }
}
