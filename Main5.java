import java.util.Scanner;
import java.util.Arrays;
public class Main5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("요소 수: ");
        int num = number.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++){
            System.out.print("a["+i+"] = ");
            Scanner num1 = new Scanner(System.in);
            int num2 = num1.nextInt();
            a[i] = num2;
        }
        System.out.println("a = "+Arrays.toString(a));

    }
}
