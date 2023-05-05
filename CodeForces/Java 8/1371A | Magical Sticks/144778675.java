import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
    if(n == 1 || n ==2 ){
     System.out.println(1);
      
    }
    else if(n == 3){
       System.out.println(2);
    }
    else{
      if(n%2 ==0)
      System.out.println(n/2);
      else 
        System.out.println((n/2)+1);
    }
    
  }
 }
}