import java.util.Date;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class manager extends ergazomenos
{
    public String[] list = new String[10];
    programma mk=new programma();
    
    public manager(String email,String name, String password,String startDate)
    {
        super( email, name,  password,startDate);
    }

    
    
    

    public void setMenu()
    {
        System.out.println("SYMPLIRWSE TH LISTA ME PIATA");
        for( int i=0; i<list.length; i++){

            
            Scanner myOb = new Scanner(System.in);
            list[i] = myOb.nextLine();
            System.out.println("KATAXWRHSH EPOMENO PIATOU ");

        }

    }
   
}

