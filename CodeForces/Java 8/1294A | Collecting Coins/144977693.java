import java.util.*;
public class Main{
 public static void main (String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i++){
   int [] a = new int [3];
   for(int j = 0 ; j < 3 ; j++)
    a[j] = input.nextInt();
    int num = input.nextInt();
    Arrays.sort(a);
    int req = (a[2]-a[1])+(a[2]-a[0]);
    if(num < req){
    System.out.println("NO");
 
    }
    else if(req == num){
     System.out.println("YES");
    
    }
    else if((num > req) && (num-req)%3 == 0){
     System.out.println("YES");
      
    }
    
     else{
        System.out.println("NO");
 
   }
  
   }
  }
 }
 