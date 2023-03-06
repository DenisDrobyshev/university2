import java.util.Scanner;
public class Quadratic_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a*x^2 + b*x + c = 0
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float D = b*b - 4*a*c;
        if (D < 0) {
            System.out.println(0);
        } else if (D == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
