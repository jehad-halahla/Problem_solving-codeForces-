import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  
   for(int i  = 0 ; i < t ; i ++ ){
        int n = input.nextInt();
  int [] a = new int [n]; 
  int [] b = new int [n];
  boolean isSorted = true;
  for(int j = 0 ; j < n ; j++){
   a[j] = input.nextInt();
   b[j] = a[j];
  }
  Arrays.sort(a);
  for(int j =0 ; j < n ; j++){
   if(a[j] != b[j]){
    isSorted = false;
    break;
    
   }
  }
  if(isSorted)
   System.out.println("NO");
  else
  System.out.println("YES");
 
  }
 }
}