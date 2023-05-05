import java.util.*;
 
public class BinarySearch {
 public static void main(String [] args) {
  Scanner input  = new Scanner(System.in);
 
   int n  = input.nextInt();
   int [] a = new int[n]; 
   int [] b = new int[n]; 
   int countA = 0; 
   int countB = 0;
   for(int j = 0 ; j < n ; j++) {
    a[j] = input.nextInt();
   }
   for(int j = 0 ; j < n ; j++) {
    b[j] = input.nextInt();
   }
   for(int j = 0 ; j < n ; j++) {
    if(a[j] > b[j])
     countA++;
    else if (b[j] > a[j])
     countB++;
   }
   if(countA == 0 )
     System.out.println(-1);
   else if(countA > countB)
    System.out.println(1);
   else 
    System.out.println((int)(Math.ceil((countB+1.0)/countA)));
  }
   
}