import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int sum = 0;
   int n = input.nextInt();
   int k = input.nextInt();
   int [] a = new int [n];
   int [] b = new int [n];
   for(int j = 0 ; j < n ; j++){
    a[j] =input.nextInt(); 
   }
   for(int j = 0 ; j < n ; j++){
    b[j] =input.nextInt(); 
   }
   Arrays.sort(a);
   Arrays.sort(b);
 
   for(int j = 0 ; j < k ; j++){
     if(a[j]<b[n-(1+j)])
    a[j] = b[n-(1+j)];
   }
   for(int j = 0 ; j < n ; j++){
    sum+=a[j];
   }
   System.out.println(sum);
  }
 }
}