import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int [] a = new int [2];
   for(int j = 0 ; j < 2 ; j++)
   a[j] = input.nextInt();
   int n = input.nextInt();
   int counter = 1;
   while(a[0]%2==0){
    a[0]/=2;
    counter*=2;
    }
    while(a[1]%2==0){
    a[1]/=2;
    counter*=2;
   }
   if(counter >= n)
    System.out.println("YES");
   else
    System.out.println("NO");
 
  }
 }
}