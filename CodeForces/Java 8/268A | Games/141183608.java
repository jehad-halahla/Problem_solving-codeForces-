import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int c = 0 ;
  int [][] a = new int [n][2];
  for(int i = 0 ; i < a.length ; i ++){
  for(int j = 0 ; j < a[i].length ; j ++){
  a[i][j]=input.nextInt();
    }
  }
   for(int i = 0 ; i < a.length-1 ; i ++){
     for(int j = i+1 ; j < a.length ; j ++){
       if(a[i][0] == a[j][1])
       c++;
        if(a[i][1] == a[j][0])
       c++;
     }
  }
     System.out.println(c);
   }
}