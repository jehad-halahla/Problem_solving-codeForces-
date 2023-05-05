import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int num = input.nextInt();
  int counter=0;
  for(int i = 0 ; i < n ; i++){
   if(num+((i+1)*5)<=240){
     num+=(i+1)*5;
   counter++;
   }
  }
 
    System.out.println(counter);
 }
}