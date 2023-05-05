import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int []  a = new int[n];
   int oddCounter = 0 ;
   int sum = 0 ;
   for(int j = 0 ; j < n ; j++){
    a[j] = input.nextInt();
    sum+=a[j];
    if(a[j]%2 != 0 )
     oddCounter++;
   }
   if(sum%2 != 0)
    System.out.println("YES");
   else if (oddCounter != n && oddCounter != 0) 
    System.out.println("YES");
   else
    System.out.println("NO");
 
  }
 }
}