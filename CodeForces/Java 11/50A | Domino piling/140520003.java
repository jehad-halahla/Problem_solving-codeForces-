import java.util.Scanner;
 
public class Test {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int m = input.nextInt();
  int n = input.nextInt();
  int i=1 ;
  while((i*2) < (m*n)) {
   ++i;
  }
  if((m*n)%2!=0)
   i--;
  System.out.println(i);
 }
}