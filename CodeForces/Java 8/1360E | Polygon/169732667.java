import java.util.Scanner;
 
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int t = input.nextInt();
    for(int i = 0 ; i < t ; i ++){
      int n = input.nextInt();
      int [][] arr = new int [n][n];
      for(int j =0 ;j < n ; j ++){
        String str = input.next(); 
        for(int k = 0 ; k < n ; k++)
        arr[j][k] = Integer.parseInt(""+str.charAt(k));
      }
      boolean isTrue = true;
      for(int j = n-2 ; j >= 0;j--)
        for(int k = n-2 ; k >= 0; k--){
          if(arr[j][k]==1 && arr[j+1][k] ==0  && arr[j][k+1]==0){
            isTrue = false;
            break;
          }
        }
        if(isTrue)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
  }
}