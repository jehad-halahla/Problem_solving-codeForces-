import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [] arr = new int[a];
 
        for (int i=0;i<a;i++){
            arr[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i=0;i<a-1;i++){
            if (arr[i]==arr[i+1]){
            }
            else {
                counter++;
            }
        }
        System.out.println(counter + 1);
 
 
    }
}