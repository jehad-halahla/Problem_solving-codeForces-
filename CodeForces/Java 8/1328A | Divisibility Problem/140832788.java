import java.util.Scanner;
 public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for(int i = 0 ; i < t ; i ++){
   int n = input.nextInt();
   int d = input.nextInt();
   int counter = 0 ;
   if(n%d!=0)
     counter=((n/d)+1)*d - n;
   System.out.println(counter);
    }
   
  }
 }