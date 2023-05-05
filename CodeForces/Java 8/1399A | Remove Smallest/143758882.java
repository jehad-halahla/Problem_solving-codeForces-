import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   boolean isReduceable = true;
   int n = input.nextInt();
   int [] a = new int [n];
   for(int j  = 0; j < n;j++){
    a[j] = input.nextInt();
   }
   Arrays.sort(a);
   for(int j  = 1; j < n;j++){
    if(a[j]-a[j-1]> 1){
     isReduceable = false;
     break;
    }
   }
   if(isReduceable){
    System.out.println("YES");
   
   }
    else 
     System.out.println("NO");
 
  }
 }
}