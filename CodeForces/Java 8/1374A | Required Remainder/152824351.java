import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   for(int i = 0 ; i < t ; i++){
     int x = input.nextInt();
     int y = input.nextInt();
     int n = input.nextInt();
     if(n%x >= y ){
       System.out.println((n - (n%x)) + y);
     }
     else{
              System.out.println((n - (n%x)) - (x-y));
 
     }
     
   }
    
  }
}