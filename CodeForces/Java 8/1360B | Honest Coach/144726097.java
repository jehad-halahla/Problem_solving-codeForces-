import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int [] a = new int [n];
   for(int j = 0 ; j < n ; j++){
    a[j]= input.nextInt();
   }
   Arrays.sort(a);
   int min = a[1]-a[0];
  
   for(int j = 0 ; j < n-1 ; j++){
    if((a[j+1]-a[j]) < min ){
     min = (a[j+1]-a[j]);
    }
   }
   System.out.println(min);
  }
 }
}