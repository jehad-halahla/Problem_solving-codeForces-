import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int gcd = 1 ;
   int n = input.nextInt();
   if(n%2 == 0){
    gcd = n/2;
   }
   else {
     gcd = (n-1)/2;
   }
  System.out.println(gcd);
  }
 }
}