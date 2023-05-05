import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner in = new Scanner(System.in);
  int [] a = {4,6,8,12,20};
  int sum = 0; 
  int n =in.nextInt();
  for(int i = 0 ; i < n ; i++){
   String str = in.next();
   if(str.charAt(0)=='T')
    sum+=a[0];
    else if(str.charAt(0)=='C')
     sum+=a[1];
     else if(str.charAt(0)=='O')
      sum+=a[2];
      else if(str.charAt(0)=='D')
       sum+=a[3];
       else
        sum+=a[4]; 
  }
System.out.println(sum);
  }
 }