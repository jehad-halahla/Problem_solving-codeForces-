import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int k = input.nextInt();
 int n = input.nextInt();
 int w = input.nextInt();
 int price = 0;
 for (int i = 0; i < w; i++) {
  price += k*(i+1);
  
 }
 if(price > n)
 System.out.println(price-n);
 else 
  System.out.println(0);
 }
}