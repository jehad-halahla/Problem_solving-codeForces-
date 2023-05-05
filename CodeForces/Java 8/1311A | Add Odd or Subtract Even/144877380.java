import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i =0 ; i < t ; i++){
   int num1 = input.nextInt();
   int num2 = input.nextInt();
   if(num1 == num2)
    System.out.println(0);
   else if( ((num1 < num2) && (num2-num1)%2 != 0)|| ((num2 < num1) && (num1-num2)%2 == 0))
    System.out.println(1);
   else
    System.out.println(2);
  }
 }
}