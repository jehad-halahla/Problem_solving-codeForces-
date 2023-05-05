import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int a = input.nextInt();
 int b = input.nextInt();
 int i = 1;
 while(a <= b) {
  a*=3;
  b*=2;
  i++;
 }
 System.out.println(i-1);
 }
}