 import java.util.Scanner;
 public class Main{
   public static void main(String []args ){
     Scanner input = new Scanner(System.in);
     long n = input.nextLong();
     long result =0;
      if (n % 2 == 1)
        result = -(n + 1) / 2;
 else
    result = n / 2;
   System.out.println(result);
     
   }
 }
 
 