import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int  i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int counter = n ;
   int oddCounter = 0;
   int [] a = new int [n];
   for(int j =0 ; j < n ; j++){
    a[j]= input.nextInt();
    if(a[j]%2 == j%2){
     counter--;
    }
    if(a[j]%2 != 0){
     oddCounter++;
    }
   }
   if(n/2 != oddCounter){
    System.out.println(-1);
   }
   else{
    System.out.println(counter/2);
   }
   
  }
 }
}