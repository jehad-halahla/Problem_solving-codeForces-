import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  double result = 0;
for(int i  = 0 ;  i < n ; i ++){
 result+=input.nextInt();
}
 System.out.println(result/n);
 }
}