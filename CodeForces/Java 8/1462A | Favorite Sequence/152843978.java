import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   for(int i = 0 ; i < t ; i++){
     int n = input.nextInt();
     int [] a = new int [n];
          int [] b = new int [n];
 
     for(int j = 0 ;  j< n ; j++){
       a[j] = input.nextInt();
     }
     int ptr1 = 0;
     int ptr2 = n-1;
     for(int j = 0 ; j < n ; j++){
       if(j%2 ==0){
         b[j] = a[ptr1++];
       }
       else{
         b[j] = a[ptr2--];
         
       }
     }
     for(int j = 0 ; j< n-1 ;j++)
     System.out.print(b[j] + " ");
     System.out.println(b[n-1]);
    }
  }
}