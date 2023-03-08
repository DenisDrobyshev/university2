import java.util.Scanner;

public class Rimskaya_ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arabicNumber = sc.nextInt();
        int []Arabic = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String []Rim = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romanNumber = "";
        int count;

        for (int i = 0; i < Arabic.length; i++)
        {
        count = arabicNumber / Arabic[i];

            for (int j = 0; j < count; j++)
            {
            romanNumber += Rim[i];
            }

        arabicNumber -= count * Arabic[i];
        }
        System.out.println(romanNumber);
        }
}
