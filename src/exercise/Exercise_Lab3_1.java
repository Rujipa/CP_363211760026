package Exercise;
import java.util.Scanner;
public class Exercise_Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers: ");
        int num = sc.nextInt();
        for (int i =1; i <=12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
