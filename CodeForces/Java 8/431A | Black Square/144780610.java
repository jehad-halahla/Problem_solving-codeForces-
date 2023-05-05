import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int [] a = new int [4];
  for(int i = 0 ; i < 4 ; i++){
   a[i] = input.nextInt();
  }
  String str = input.next();
  int sum = 0 ;
  for( int i = 0 ; i < str.length();i++){
  if(str.charAt(i) == '1')
  sum += a[0];
  else if(str.charAt(i) == '2')
  sum += a[1];
   if(str.charAt(i) == '3')
  sum += a[2];
   if(str.charAt(i) == '4')
  sum += a[3];
  }
  System.out.println(sum);
 }
}