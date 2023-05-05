import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int k = input.nextInt();
  int r = input.nextInt();
  int counter = 1;
  int num =k;
  for(int i = 2 ; i <= 10 ; i++){
   if(num%10 == r || num%10==0){
    break;
   }
   else{
    num = k * i;
   counter++;
   }
  }
  System.out.println(counter);
 }
}