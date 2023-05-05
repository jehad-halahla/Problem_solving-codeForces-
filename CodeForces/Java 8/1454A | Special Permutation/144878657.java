import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i =0 ; i < t ; i++){
   int n = input.nextInt();
   int [] a = new int[n];
   for(int j = 0 ; j < n ; j ++){
    a[j]  =(n-j);
    }
    if(n%2 !=0){
     int temp = a[n/2];
     a[n/2] =a[(n/2)+1];
     a[(n/2)+1]=temp;
    }
   for(int j = 0 ; j < n ; j++){
    if(j !=(n-1))
    System.out.print(a[j] +" ");
   else
    System.out.println(a[j]);
 
   }
  }
 }
}