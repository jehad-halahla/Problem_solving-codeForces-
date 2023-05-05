import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  int [] a  = {1,2,3,4};
  for(int i = 0; i < t ; i++){
   int  x = input.nextInt();
   int digNum = (""+x).length();
   int dig = x%10;
   int result = 10*(dig-1);
   for(int j = 0 ; j < digNum ; j++){
    result += a[j];
   }
   System.out.println(result);
  }
 }
}