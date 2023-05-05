import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 String str = input.next();
 if('a'<=str.charAt(0) && 'z'>=str.charAt(0))
 str = str.replaceFirst(""+str.charAt(0), ""+(char)(str.charAt(0)-32) );
 System.out.println(str);
 }
}