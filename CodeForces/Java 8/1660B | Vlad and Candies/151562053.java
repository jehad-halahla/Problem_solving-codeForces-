import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
  int n = input.nextInt();
  int [] a = new int [n];
    for(int j = 0 ; j < n ; j++)
       a[j] = input.nextInt();
       Arrays.sort(a);
       if(n > 1){
            if(a[n-1] - a[n-2] > 1)
                System.out.println("NO");
            else 
                System.out.println("YES");
       }
       else{
         if(a[0] != 1)
               System.out.println("NO");
            else 
                  System.out.println("YES");
 
       }
 
  }
 }
}