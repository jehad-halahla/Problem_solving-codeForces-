import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for(int j = 0 ; j < t ; j++){
      int n = input.nextInt();
      int [] a = new int[n];
      a[0] = input.nextInt();
      int max = a[0];
      int min = a[0];
      int minIndex = 0;
      int maxIndex = 0;
      for(int i = 1; i < n ; i++){
        a[i] = input.nextInt();
        if(a[i] > max){
          maxIndex = i;
          max = a[i];
        }
        else if(a[i] < min){
          minIndex = i;
          min = a[i];
        }
      }
      int case1 = (n-minIndex) + (maxIndex+1);
      int case2 = (n-maxIndex) + (minIndex+1);
      int case3 = (n-Math.max(minIndex,maxIndex)) + (int)Math.abs(minIndex - maxIndex);
      int case4 = (Math.min(minIndex,maxIndex)+1) + (int)Math.abs(minIndex - maxIndex);
      System.out.println(Math.min(Math.min(Math.min(case1,case2),case3),case4));
 
     
    }
  }
}