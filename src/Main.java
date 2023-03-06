import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 21){
            System.out.print("Да");
        }
        else{
            System.out.print("Нет");
        }
    }
}