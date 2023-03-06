import java.util.Scanner;

public class Visokosny_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
