import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int n = input.nextInt();
   int [] a = new int [n];
   for(int j = 0 ; j < n ; j++)
    a[j] = input.nextInt();
   Arrays.sort(a);
   System.out.println(a[n-1]-a[0]);
  }
    }
 }
 