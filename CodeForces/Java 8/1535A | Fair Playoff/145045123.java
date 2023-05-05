import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  
  for(int i = 0 ; i < t ; i ++){
  int [] a = new int [2];
  int [] b = new int[2];
  for(int j = 0  ; j < 4 ;j++){
   if(j<2)
    a[j]= input.nextInt();
   else
    b[j-2] = input.nextInt();
   }
   Arrays.sort(a);
   Arrays.sort(b);
   if(a[0]>b[1] || b[0] > a[1])
    System.out.println("NO");
   else
    System.out.println("YES");
 
  }
 }
}