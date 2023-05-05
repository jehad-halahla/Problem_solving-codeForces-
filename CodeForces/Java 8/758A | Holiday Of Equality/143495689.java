import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  Integer [] a = new Integer[n];
  int total = 0 ;
  for(int i = 0 ; i < n;i++){
   a[i] = input.nextInt();
  }
   int max = Collections.max(Arrays.asList(a));
   for(int i= 0 ; i < n ; i++){
    total+=(max-a[i]);
   }
   System.out.println(total);
 }
}