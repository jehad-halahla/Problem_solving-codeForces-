import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int [][] matrix = new int[5][5];
  int coloumn=0,row=0;
  for(int i =  0 ; i < 5;i++) {
   for(int j = 0 ; j<5 ; j++) {
    matrix[i][j]=input.nextInt();
    if(matrix[i][j]==1) {
     coloumn = j;
     row =  i ;
     break;
     }
    }
  }
  System.out.println(Math.abs((row-2))  + Math.abs((coloumn-2)));
 }
}