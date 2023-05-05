import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
  for (int i = 0; i < t; i++) {
    int [] a = new int [4] ;
    a[0]  = input.nextInt(); 
    int counter = 0 ;
    for(int j = 1 ; j < 4 ; j++){
      a[j] = input.nextInt();
      if  (a[0] < a[j] )
      counter++;
    }
    System.out.println(counter);
    
  }
 }
}