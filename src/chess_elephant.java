import java.util.Scanner;
public class chess_elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slonX = sc.nextInt(), slonY = sc.nextInt();
        int chessX = sc.nextInt(), chessY = sc.nextInt();

        if ((chessX == slonX - 2 && chessY == slonY - 2) || (chessX == slonX + 2 && chessY == slonY + 2) || (chessX == slonX - 2 && chessY == slonY + 2) || (chessX == slonX + 2 && chessY == slonY - 2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
