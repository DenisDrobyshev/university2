import java.util.Scanner;
public class Cutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (k >= n) {
            System.out.println(m*2);
        } else if (n*2 % k == 0){
            System.out.println(m*(n*2/k));
        } else {
            System.out.println(m*(1+(n*2/k)));
        }
    }
}
