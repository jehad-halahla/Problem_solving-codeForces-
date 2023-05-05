import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  
  for (int i = 0; i < t; i++) {
   int n = input.nextInt();
   int [] a = new int [n];
   for(int j = 0 ; j < n ; j ++) {
    a[j] = input.nextInt();
    }
    for(int j = 0 ; j < n ; j++) {
     int len = input.nextInt();
     String str = input.next();
     int upCounter = 0;
     int downCounter = 0 ;
     for(int k = 0 ; k < len ; k ++) {
      if(str.charAt(k)=='U') 
       downCounter++;
      else
       upCounter++;
     }
     int res   = (upCounter  - downCounter)%10; 
     a[j] = a[j]+ res;
     if(a[j] >  0 )
      a[j] = a[j]%10;
     else if(a[j]<0) {
      a[j] = 10 + a[j];
     }
     System.out.print(a[j] + " ");
    
    }
    System.out.println();
   
    
   }
   
  }
 }
 