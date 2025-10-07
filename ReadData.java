import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ReadData {
    public void read(){

        Scanner in;
        try{
            in = new Scanner(new File("songs2025-2026.csv"));
            while(in.hasNext())
            {
                System.out.println(in.nextLine());
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
    
}