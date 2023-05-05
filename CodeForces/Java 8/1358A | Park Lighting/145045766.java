import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt(); 
  for(int i = 0 ; i < t ; i ++){
   int x = input.nextInt();
   int y = input.nextInt();
   if((x*y)%2==0)
   System.out.println((x*y)/2);
   else
    System.out.println(((x*y)+1)/2);
 
  }
 }
}