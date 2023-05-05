import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i ++){
   int n = input.nextInt();
   if(n%2 == 0 && (n/2)%2 ==0 )
    System.out.println("YES");
   else
    System.out.println("NO");
 
  
   }
  }
 }