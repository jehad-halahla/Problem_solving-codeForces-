import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int []  a = new int [n];
    int counter1 = 0; 
    int counter2 = 0; 
    int counter3 = 0;
    for(int i = 0 ; i < n ; i++){
      a[i] = input.nextInt();
      if(a[i] == 1)
      counter1++;
       else if(a[i] == 2)
       counter2++;
        else if(a[i] == 3)
        counter3++;
    }
    int count = Math.min(Math.min(counter1,counter2),counter3);
    int [][] b = new int [count][3];
    for(int i=0 ; i < count ; i++)
      for(int j = 0 ; j < 3 ; j++){
        b[i][j] = -1;
      }
    for(int i = 0 ; i < count ;i++)
    for(int j = 0 ;j < n ; j++){
      if(a[j] == 1 && b[i][0] ==-1 ){
        b[i][0] = j+1;
        a[j] = 0;
      }
      else if(a[j] == 2 && b[i][1] ==-1){
         b[i][1] = j+1;
        a[j] = 0;
      }
      else if (a[j] == 3 && b[i][2] == -1 ){
        b[i][2] = j+1 ;
        a[j] = 0;
      }
    }
    if(count != 0){
      System.out.println(count);
        for(int i = 0; i < count; i++)
        System.out.printf("%d %d %d\n",b[i][0],b[i][1],b[i][2]);
    }
  
        else
        System.out.println(0);
  }
}