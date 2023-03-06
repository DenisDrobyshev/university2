import java.util.Scanner;
public class Red_Shapka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 22){
            System.out.print(a-10);
        }
        else{
            System.out.print(a/2);
        }
    }
}
