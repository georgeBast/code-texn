import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class pelaths extends xrhsths 
{
    public int k;

    
    List<Integer> par = new ArrayList<>();
   
    
    
    protected int customer_ID;
    protected String adress;
    public pelaths(String email, String name , String password,String startDate)
     {
         
         super(email,name,password,startDate);
        }
    xrhsths x = new xrhsths("asdj@gmail.com","orestis","fako","asdsf");
    piata p = new piata();
    int count=0;
   
   public void verifyLogin(String nm,String pass){
     
     x.isLoggedIn(nm, pass);
   }
   
   public void order(manager m) {
       
       System.out.println("Posa piata thelete na parageilete ");
       Scanner myOb = new Scanner(System.in);
            this.k = myOb.nextInt();
            
            
       
       for (int i = 0 ; i<k; i++) {
           System.out.println("Dwse ID tou piatou ");
           Scanner myOb1 = new Scanner(System.in);
           par.add(myOb1.nextInt());
            System.out.print("Epileksate : " );
            System.out.println(m.list[par.get(i)-1]);
            
            
        }
        
        
        
        
        
   
    }
      
    public void axiologisi(){
       System.out.println("Dwse ba8mologia gia thn paragelia ");
               
       
       Scanner myOb1 = new Scanner(System.in);
       int rating = myOb1.nextInt();
       boolean valid = true;
       while(valid) {
       if ((rating>0) && (rating <6) ) {
           System.out.println ("H vathmologia sas einai: " + rating );
           System.out.println ("Eisagete keimeno aksiologisis");
           String keimeno;
           Scanner myOb3 = new Scanner(System.in);
           keimeno = myOb3.nextLine();
           valid = false;
        }
           else {
           System.out.println("Mh apodekth aksiologisi");
           System.out.println("Dwste nea vathmologia ");
           Scanner myOb2 = new Scanner(System.in);
           rating = myOb2.nextInt();
           
                   
            }      
          }   
      
        }
}
        
   
    
    
     
    
    
    
    
    

    
    //public void epiloghPiatou(){
        
        
        
        
       // System.out.println("dialexe piato apo thn lista");
       // Scanner myObj = new Scanner( System.in);
          //   p.piatoID = myObj.nextInt();
          //System.out.println(p.list[p.piatoID-1]);//mion 1
        
        
        
        
    
    
    
    //public void aksiolParaggelias( int istoriko[]){
        
    
    
    
    

