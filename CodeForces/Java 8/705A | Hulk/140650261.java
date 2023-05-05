import java.util.Scanner;
public class Main{
 public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  int  n = input.nextInt();
  String result = "";
for(int i  = 0 ;  i < n ; i ++){
 if(i%2==0)
  result += "I hate ";
 else
 result += "I love ";
 if(i==(n-1))
  result+="it";
 else
  result+="that ";
}
 System.out.println(result);
 }
}