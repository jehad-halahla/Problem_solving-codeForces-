import java.util.*;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int m = input.nextInt();
  int nextPrime = n;
  for(int j = n+1 ; j<=m;j++){
     boolean isPrime = true;
  for(int i = 2 ; i < n;i++){
   if(j%i ==0 ){
    isPrime = false;
    break;
   }
  }
  if(isPrime){
      nextPrime = j;
    break;
  }
  }
 if(nextPrime == m)
 System.out.println("YES");
 else
 System.out.println("NO");
 
 }
}