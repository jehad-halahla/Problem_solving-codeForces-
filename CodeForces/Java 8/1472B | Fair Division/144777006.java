import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int [] a = new int [n];
   int counter = 0 ;
   for(int j = 0 ;j < n ; j++){
    a[j] = input.nextInt();
    if(a[j] == 1 )
     counter++;
   }
   if(counter%2 == 0 && counter != 0)
    System.out.println("YES");
   else if((n-counter)%2 ==0 && counter%2 ==0 )
    System.out.println("YES");
   else
    System.out.println("NO"); 
  }
 }
}