import java.util.Scanner;
 
public class Watermelon {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int k = input.nextInt();
  int qualifiers=0;
  int [] contestants = new int[n];
  for(int i=0; i< n ; i++) {
   contestants[i] = input.nextInt();
  }
  
  for (int i = 0; i < contestants.length; i++) {
   if((contestants[i] >=contestants[k-1])&&contestants[i]!=0)
    qualifiers++;
  }
  System.out.println(qualifiers);
 }
}