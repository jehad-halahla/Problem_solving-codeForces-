import java.util.Scanner;
 
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int money = input.nextInt();
  int[] a = {1,5,10,20,100};
  int counter = 0;
  int i = 4;
  while(i >= 0){
   if (money < a[i]) {
    
   } else {
    counter+=money/a[i];
    money=money%a[i];
   }
   i--;
  }
  System.out.println(counter);
 }
}