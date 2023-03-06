import java.util.Scanner;

public class Count_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a * x + b = 0
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != 0) {
            System.out.println(1);
        } else if (b != 0) {
            System.out.println(0);
        } else {
            System.out.println("inf");
        }
    }

}


