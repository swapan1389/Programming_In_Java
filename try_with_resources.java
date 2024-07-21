import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_with_resources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num=0;
        // BufferedReader br=null;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
        {
            //InputStreamReader in=new InputStreamReader(System.in);
            //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number:");
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        // finally{
        //     br.close();
        // }
    }
    
}
