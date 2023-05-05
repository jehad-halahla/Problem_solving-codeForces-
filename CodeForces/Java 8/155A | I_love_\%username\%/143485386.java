import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  
  int n = input.nextInt();
  int [] a  = new int[n];
  a[0]= input.nextInt();
  int min = a[0];
  int max = a[0];
  int counter =0 ;
  for(int i = 1 ; i < n ;i++ ){
   a[i]  =input.nextInt();
   if(a[i]> max){
    counter++;
    max = a[i];
   }
   else if(a[i]<min){
    counter++;
    min= a[i];
   }
  }
    System.out.println(counter);
 }
}