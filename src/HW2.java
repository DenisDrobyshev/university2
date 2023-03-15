import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задача 6
        System.out.println("Задача 6, введите числа: ");
        double num, sum = 0;
        do {
            num = sc.nextDouble();
            sum += num;
        }
        while (num != 0);
        System.out.println(sum);

        // Задача 7
        System.out.println("Задача 7, введите n и x: ");
        int n = sc.nextInt(), x = sc.nextInt();
        int summ = x;
        while (summ < n) {
            summ += x;
        }
        System.out.println(summ);

        // Задача 8
        System.out.println("Задача 8, введите n и x: ");
        int n1 = sc.nextInt(), a = sc.nextInt(), s = a;
        int count = 1;
        while (s < n1) {
            a = sc.nextInt();
            s *= a;
            count++;
        }
        System.out.println(count + " " + s);

        // Задача 9
        System.out.println("Задача 9, введите число: ");
        int n2 = sc.nextInt(), i = 1;
        String star = "*";
        while (i <= n2) {
            System.out.println(star);
            i++;
            star += "*";
        }

        // Задача 10
        System.out.println("Задача 10, введите число: ");
        int n5 = sc.nextInt();
        int i5 = 0;
        String k = "*";
        String p = k;
        String pr;
        int nr = n5 - 1;
        while (i5 < n5) {
            pr = " ".repeat(nr);
            System.out.println(pr + p);
            p = p + k + k;
            i5++;
            nr--;
        }
    }
}

