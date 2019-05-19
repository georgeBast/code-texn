import java.util.Date;
import java.lang.*;
import java.util.*;
 public class xrhsths
{

    
    
    protected  String email,startDate;
   
    
    protected int thlefono;
    protected String name,password;
    
    
    
    public xrhsths(String email,String name,String password, String startDate)
    {
        this.email=email;
        this.name=name;
        this.password=password;
        this.startDate=startDate;
        
    }

    
     void isLoggedIn( String nm, String pass)
    {
        if(nm.equals(name) && pass.equals(password))
           System.out.println(" epitixhs eisodos");
        else
           System.out.println(" lathos stoixeia");
           
    }
}
