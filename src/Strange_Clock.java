import java.util.Scanner;
public class Strange_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        if ((h*60*60 + m*60) >= x) {
            System.out.print("Успел");
        }
        else {
            System.out.print("Опоздал");
        }
    }
}
