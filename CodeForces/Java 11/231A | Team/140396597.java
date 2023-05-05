import java.util.Scanner;
 
public class Watermelon {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int problems=0;
  for(int i=0; i< n ; i++) {
   int p1 = input.nextInt();
   int p2 = input.nextInt();
   int p3 = input.nextInt();
   if((p1+p2+p3)>1)
    problems++;
 
  }
  System.out.println(problems);
 }
}