import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
   int n = input.nextInt();
      int i = 1;
   while(n>((i+1)*(i+2))/2){
    n-=((i+1)*(i+2))/2;
    i++;
   }
   System.out.println(i);
 }
}